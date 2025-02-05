package edu.qsng.Circuits.SequentialLogic.ShiftRegisters
import chisel3._
import chisel3.util.Cat
import circt.stage.ChiselStage

class ece241_2013_q12 extends Module with ImplicitClock {

  val clk = IO(Input(Clock()))
  val enable = IO(Input(Bool()))
  val S= IO(Input(Bool()))
  val A= IO(Input(Bool()))
  val B= IO(Input(Bool()))
  val C= IO(Input(Bool()))
  val Z = IO(Output(Bool()))
  override protected def implicitClock = clk

  val qReg = Reg(UInt(8.W))
  when(enable){
    qReg := Cat(qReg(6,0),S)
  }
  Z := qReg(Cat(A,B,C));
}
object ece241_2013_q12 extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new ece241_2013_q12,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}
