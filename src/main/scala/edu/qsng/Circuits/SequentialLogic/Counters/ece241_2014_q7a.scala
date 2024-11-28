package edu.qsng.Circuits.SequentialLogic.Counters
import chisel3._
import circt.stage.ChiselStage

class ece241_2014_q7a extends Module with ImplicitClock {

  val clk = IO(Input(Clock()))
  val rst = IO(Input(Bool()))
  val enable= IO(Input(Bool()))
  val Q  = IO(Output(UInt(4.W)))
  val c_enable = IO(Output(Bool()))
  val c_load = IO(Output(Bool()))
  val c_d = IO(Output(UInt(4.W)))

  override protected def implicitClock = clk
  val ct4 = Module(new count4)
  c_enable := enable
  c_load := rst || (Q === 12.U && enable)
  c_d := 1.U
  ct4.io.clk := clk
  ct4.io.load := c_load
  ct4.io.enable := c_enable
  ct4.io.d := c_d
  Q := ct4.io.Q

}

object ece241_2014_q7a extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new ece241_2014_q7a,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}

