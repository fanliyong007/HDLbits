package edu.qsng.Circuits.SequentialLogic.MoreCircuits
import chisel3._
import chisel3.util.Cat
import circt.stage.ChiselStage

class Rule110 extends Module with ImplicitClock {

  val clk = IO(Input(Clock()))
  val load = IO(Input(Bool()))
  val data= IO(Input(UInt(512.W)))
  val q = IO(Output(UInt(512.W)))
  override protected def implicitClock = clk
  val qReg = Reg(UInt(512.W))
  qReg := data
  when(load){
    qReg:=data
  }.otherwise{
    qReg := (((qReg(511,0) ^ Cat(qReg(510,0), 0.U)) & qReg(511,1)) | ((qReg(511,0) | Cat(qReg(510,0), 0.U)) & (~qReg(511,1))))
  }
  q:=qReg
}
object Rule110 extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new Rule110,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}
