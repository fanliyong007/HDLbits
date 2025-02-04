package edu.qsng.Circuits.SequentialLogic.ShiftRegisters
import chisel3._
import chisel3.util.Cat
import circt.stage.ChiselStage
class Lfsr32 extends Module with ImplicitClock {

  val clk = IO(Input(Clock()))
  val q = IO(Output(UInt(32.W)))
  override protected def implicitClock = clk
  val qReg = RegInit("h1".U(32.W))
  qReg := Cat(q(0)^0.U,q(31,23),q(22)^q(0),q(21,3),q(2)^q(0),q(1)^q(0))
  q := qReg
}
object Lfsr32 extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new Lfsr32,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}