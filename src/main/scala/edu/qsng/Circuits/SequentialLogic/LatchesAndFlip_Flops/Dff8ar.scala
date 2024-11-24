package edu.qsng.Circuits.SequentialLogic.LatchesAndFlip_Flops

import chisel3._

class Dff8ar  extends RawModule {
  val clk = IO(Input(Clock()))
  val areset = IO(Input(Bool()))
  val d = IO(Input(UInt(8.W)))
  val q = IO(Output(UInt(8.W)))
  //(~clk.asUInt).asBool.asClock can  be triggered by the negative edge of clk.
  withClockAndReset(clk,areset.asAsyncReset){
      val myReg = RegInit(UInt(8.W),false.B)
      myReg := d
      q := myReg
    }
}
