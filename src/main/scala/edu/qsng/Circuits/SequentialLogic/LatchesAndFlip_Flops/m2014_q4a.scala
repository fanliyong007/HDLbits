package edu.qsng.Circuits.SequentialLogic.LatchesAndFlip_Flops

import chisel3._
import chisel3.stage.ChiselStage

class m2014_q4a extends RawModule {
  val d = IO(Input(UInt(8.W)))
  val ena = IO(Input(Bool()))
  val q = IO(Output(UInt(8.W)))
  //(~clk.asUInt).asBool.asClock can  be triggered by the negative edge of clk.
  withClock() {
    val myReg=Reg(UInt(8.W))
    q:=myReg
    when(ena){
      myReg:=d
    }.otherwise{
      myReg:=q
    }
  }
}

object m2014_q4a extends App {
  (new ChiselStage).emitVerilog(new m2014_q4a, Array("-td", "vout"))
}
