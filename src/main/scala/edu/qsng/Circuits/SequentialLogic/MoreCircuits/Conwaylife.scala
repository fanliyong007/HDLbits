package edu.qsng.Circuits.SequentialLogic.MoreCircuits
import chisel3._
import chisel3.util.Cat
import circt.stage.ChiselStage

class Conwaylife extends Module with ImplicitClock {

  val clk = IO(Input(Clock()))
  val load = IO(Input(Bool()))
  val data= IO(Input(UInt(512.W)))
  val q = IO(Output(UInt(512.W)))
  override protected def implicitClock = clk

}
object Conwaylife extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new Conwaylife,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}
