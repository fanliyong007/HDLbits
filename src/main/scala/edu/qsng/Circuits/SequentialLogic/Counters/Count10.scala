package edu.qsng.Circuits.SequentialLogic.Counters
import chisel3._
import circt.stage.ChiselStage

class Count10 extends Module with ImplicitClock {
  val clk = IO(Input(Clock()))
  val q = IO(Output(UInt(4.W)))

  override protected def implicitClock = clk
  val qReg = RegInit(0.U(4.W))
  when(qReg===9.U){
    qReg := 0.U
  }.otherwise{
    qReg := qReg + 1.U
  }
  q := qReg
}

object Count10 extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new Count10,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}
