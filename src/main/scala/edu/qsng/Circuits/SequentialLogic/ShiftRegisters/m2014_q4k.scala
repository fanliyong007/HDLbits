package edu.qsng.Circuits.SequentialLogic.ShiftRegisters
import chisel3._
import chisel3.util.Cat
import circt.stage.ChiselStage

class m2014_q4k extends Module with ImplicitClock with ImplicitReset {
  val clk = IO(Input(Clock()))
  val resetn = IO(Input(Bool()))
  val in = IO(Input(Bool()))
  val out = IO(Output(Bool()))
  override protected def implicitClock = clk
  override protected def implicitReset = !resetn
  val outReg= Array.fill(4)(RegInit(0.U(1.W)))
  outReg(0):=in
  outReg(1):=outReg(0)
  outReg(2):=outReg(1)
  outReg(3):=outReg(2)
  out:=outReg(3)
}
object m2014_q4k extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new m2014_q4k,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}