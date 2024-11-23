package edu.qsng.Circuits.SequentialLogic.LatchesAndFlip_Flops
import chisel3._
import chisel3.stage.ChiselStage

class m2014_q4b extends RawModule {
  val clk = IO(Input(Clock()))
  val d = IO(Input(Bool()))  // 输入d
  val ar = IO(Input(Bool())) //asynchronous reset
  val q = IO(Output(Bool()))  // 输出q
  withClockAndReset(clk,ar.asAsyncReset){
    val myReg=RegInit(false.B)
    myReg:=d
    q:=myReg
  }

}

object m2014_q4b extends App {
  (new ChiselStage).emitVerilog(new m2014_q4b, Array("-td", "vout"))
}
