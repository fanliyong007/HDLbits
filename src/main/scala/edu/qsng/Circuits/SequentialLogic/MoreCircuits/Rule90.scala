package edu.qsng.Circuits.SequentialLogic.MoreCircuits
import chisel3._
import chisel3.util.Cat
import circt.stage.ChiselStage

class Rule90 extends Module with ImplicitClock {

  val clk = IO(Input(Clock()))
  val load = IO(Input(Bool()))
  val data= IO(Input(UInt(512.W)))
  val q = IO(Output(UInt(512.W)))
  override protected def implicitClock = clk
  val qReg = Reg(UInt(512.W))
  when(load){
    qReg:=data
  }.otherwise{
    qReg := Cat(0.U,q(511,1))^Cat(q(510,0),0.U)
  }
  q:=qReg
}
object Rule90 extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new Rule90,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}
