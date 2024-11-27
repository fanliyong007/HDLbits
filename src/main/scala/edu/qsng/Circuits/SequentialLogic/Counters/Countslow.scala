package edu.qsng.Circuits.SequentialLogic.Counters
import chisel3._
import circt.stage.ChiselStage

class Countslow extends Module with ImplicitClock {
  val clk = IO(Input(Clock()))
  val slowena = IO(Input(Bool()))
  val q = IO(Output(UInt(4.W)))

  override protected def implicitClock = clk
  val qReg = RegInit(0.U(4.W))
  when(slowena === true.B && qReg =/= 9.U){
    qReg := qReg + 1.U
  }
  when(slowena === true.B && qReg === 9.U){
    qReg := 0.U
  }
  q := qReg
}

object Countslow extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new Countslow,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}