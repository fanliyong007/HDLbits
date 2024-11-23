package edu.qsng.Circuits.SequentialLogic.LatchesAndFlip_Flops
import chisel3._
import chisel3.stage.ChiselStage

class m2014_q4c extends RawModule {
  val clk = IO(Input(Clock()))
  val d = IO(Input(Bool()))  // 输入d
  val r = IO(Input(Bool())) //asynchronous reset
  val q = IO(Output(Bool()))  // 输出q
  withClockAndReset(clk,r){
    val myReg=RegInit(false.B)
    myReg:=d
    q:=myReg
  }

}

object m2014_q4c extends App {
  (new ChiselStage).emitVerilog(new m2014_q4c, Array("-td", "vout"))
}