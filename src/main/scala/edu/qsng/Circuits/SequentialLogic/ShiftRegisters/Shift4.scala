package edu.qsng.Circuits.SequentialLogic.ShiftRegisters
import chisel3._
import chisel3.util.Cat
import circt.stage.ChiselStage

class Shift4  extends Module with ImplicitClock {

  val clk = IO(Input(Clock()))
  val areset = IO(Input(Bool()))
  val ena = IO(Input(Bool()))
  val load = IO(Input(Bool()))
  val data = IO(Input(UInt(4.W)))
  val q = IO(Output(UInt(4.W)))
  withClockAndReset(clk,areset.asAsyncReset){
      val qReg = RegInit(0.U(4.W))
      when(load){
        qReg:=data
      }.elsewhen(ena){
        qReg:=qReg>>1
      }
      q:=qReg
  }
}
object Shift4 extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new Shift4,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}