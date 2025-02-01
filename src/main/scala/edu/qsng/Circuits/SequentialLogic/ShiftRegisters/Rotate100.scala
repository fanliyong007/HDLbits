package edu.qsng.Circuits.SequentialLogic.ShiftRegisters
import chisel3._
import chisel3.util.Cat
import circt.stage.ChiselStage

class Rotate100 extends Module with ImplicitClock {

  val clk = IO(Input(Clock()))
  val load = IO(Input(Bool()))
  val ena = IO(Input(UInt(2.W)))
  val data = IO(Input(UInt(100.W)))
  val q = IO(Output(UInt(100.W)))
  override protected def implicitClock = clk
  val qReg = Reg(UInt(100.W))
  when(load){
    qReg := data
  }.elsewhen(ena==="b01".U){
    qReg := Cat(qReg(0),qReg(99,1))
  }.elsewhen(ena==="b10".U){
    qReg := Cat(qReg(98,0),qReg(99))
  }
  q:=qReg
}
object Rotate100 extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new Rotate100,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}
