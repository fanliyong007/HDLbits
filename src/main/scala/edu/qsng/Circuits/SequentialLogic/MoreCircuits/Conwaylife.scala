package edu.qsng.Circuits.SequentialLogic.MoreCircuits
import chisel3._
import chisel3.util.{Cat, MuxCase}
import circt.stage.ChiselStage

class Conwaylife extends Module with ImplicitClock {

  val clk = IO(Input(Clock()))
  val load = IO(Input(Bool()))
  val data= IO(Input(UInt(256.W)))
  val q = IO(Output(UInt(256.W)))
  override protected def implicitClock = clk
  val nextQ = Wire(Vec(256, UInt(1.W)))
  for (i <- 0 until 256) {
    val currentQ = q
    val sum = {
      if (i == 0) {
        currentQ(1) + currentQ(16) + currentQ(17) + currentQ(240) + currentQ(241) + currentQ(15) + currentQ(31) + currentQ(255)
      } else if (i == 15) {
        currentQ(14) + currentQ(16) + currentQ(0) + currentQ(240) + currentQ(254) + currentQ(30) + currentQ(31) + currentQ(255)
      } else if (i == 240) {
        currentQ(0) + currentQ(15) + currentQ(239) + currentQ(241) + currentQ(1) + currentQ(224) + currentQ(225) + currentQ(255)
      } else if (i == 255) {
        currentQ(0) + currentQ(15) + currentQ(14) + currentQ(224) + currentQ(238) + currentQ(240) + currentQ(239) + currentQ(254)
      } else if (i > 0 && i < 15) {
        currentQ(i-1) + currentQ(i+1) + currentQ(i+15) + currentQ(i+16) + currentQ(i+17) + currentQ(i+239) + currentQ(i+240) + currentQ(i+241)
      } else if (i % 16 == 0) {
        currentQ(i-1) + currentQ(i+1) + currentQ(i+15) + currentQ(i+16) + currentQ(i+17) + currentQ(i-16) + currentQ(i-15) + currentQ(i+31)
      } else if (i % 16 == 15) {
        currentQ(i-1) + currentQ(i+1) + currentQ(i+15) + currentQ(i+16) + currentQ(i-17) + currentQ(i-16) + currentQ(i-15) + currentQ(i-31)
      } else if (i > 240 && i < 255) {
        currentQ(i-1) + currentQ(i+1) + currentQ(i-17) + currentQ(i-16) + currentQ(i-15) + currentQ(i-239) + currentQ(i-240) + currentQ(i-241)
      } else {
        currentQ(i-1) + currentQ(i+1) + currentQ(i-17) + currentQ(i-16) + currentQ(i-15) + currentQ(i+15) + currentQ(i+16) + currentQ(i+17)
      }
    }

    val newBit = Wire(UInt(1.W))
    when (sum === 0.U || sum === 1.U || sum >= 4.U) {
      newBit := 0.U
    }.elsewhen (sum === 3.U) {
      newBit := 1.U
    }.otherwise {
      newBit := currentQ(i)
    }
    nextQ(i) := newBit
  }
  when(load) {
    q := data
  }.otherwise {
    q := nextQ.asUInt
  }
}
object Conwaylife extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new Conwaylife,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}
