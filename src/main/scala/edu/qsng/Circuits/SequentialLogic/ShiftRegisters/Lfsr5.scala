package edu.qsng.Circuits.SequentialLogic.ShiftRegisters
import chisel3._
import chisel3.util.Cat
import circt.stage.ChiselStage

class Lfsr5 extends Module with ImplicitClock {

  val clk = IO(Input(Clock()))
  val q = IO(Output(UInt(5.W)))
  override protected def implicitClock = clk
  val qReg = RegInit("h1".U(5.W))
  qReg := Cat(q(0)^0.U,q(4),q(3)^q(0),q(2),q(1))
  q := qReg
}
object Lfsr5 extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new Lfsr5,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}