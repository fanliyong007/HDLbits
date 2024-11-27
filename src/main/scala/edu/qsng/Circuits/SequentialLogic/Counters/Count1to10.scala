package edu.qsng.Circuits.SequentialLogic.Counters
import chisel3._
import chisel3.ltl.Sequence.BoolSequence
import circt.stage.ChiselStage

class Count1to10 extends Module with ImplicitClock {
  val clk = IO(Input(Clock()))
  val q = IO(Output(UInt(4.W)))

  override protected def implicitClock = clk
  val qReg = RegInit(1.U(4.W))
  when(qReg === 10.U){
    qReg := 1.U
  }.otherwise{
    qReg := qReg + 1.U
  }
  q := qReg
}

object Count1to10 extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new Count1to10,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}

