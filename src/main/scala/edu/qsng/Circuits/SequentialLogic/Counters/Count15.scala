package edu.qsng.Circuits.SequentialLogic.Counters
import chisel3._
import circt.stage.ChiselStage

class Count15 extends Module with ImplicitClock {
  val clk = IO(Input(Clock()))
  val q = IO(Output(UInt(4.W)))

  override protected def implicitClock = clk
  val qReg = RegInit(0.U(4.W))
  qReg := qReg + 1.U
  q := qReg
}

object Count15 extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new Count15,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}