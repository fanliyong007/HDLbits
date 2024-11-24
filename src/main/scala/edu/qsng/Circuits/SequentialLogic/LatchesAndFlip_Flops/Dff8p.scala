package edu.qsng.Circuits.SequentialLogic.LatchesAndFlip_Flops

import chisel3._

class Dff8p extends RawModule {
  val clk = IO(Input(Clock()))
  val reset = IO(Input(Bool()))
  val d = IO(Input(UInt(8.W)))
  val q = IO(Output(UInt(8.W)))

  withClockAndReset((~clk.asUInt).asBool.asClock, reset) {
    val dffReg = RegInit(0x34.U(8.W))
    when(reset.asBool) {
      dffReg := 0x34.U(8.W)
    }.otherwise {
      dffReg := d
    }
    q := dffReg
  }
}
