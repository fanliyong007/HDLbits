package edu.qsng.Circuits.SequentialLogic.Counters
import chisel3._
import circt.stage.ChiselStage

class ece241_2014_q7a extends Module with ImplicitClock {
  val clk = IO(Input(Clock()))
  val enable,load = IO(Input(Bool()))
  val d = IO(Input(UInt(4.W)))
  val c_enable,c_load = IO(Output(Bool()))
  val q,c_d = IO(Output(UInt(4.W)))

  override protected def implicitClock = clk
  val qReg = Reg(UInt(4.W))
  val ct4 = Module(new count4())


  q := qReg
}

object ece241_2014_q7a extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new ece241_2014_q7a,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}