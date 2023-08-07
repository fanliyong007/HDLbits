package edu.qsng.Circuits.SequentialLogic.LatchesAndFlip_Flops

import chisel3._
import chisel3.stage.ChiselStage

class Dff16e extends RawModule {
  val clk = IO(Input(Clock()))
  val reset = IO(Input(Bool()))
  val d = IO(Input(UInt(8.W)))
  val q = IO(Output(UInt(8.W)))
  //(~clk.asUInt).asBool.asClock can  be triggered by the negative edge of clk.
  withClockAndReset(clk, reset) { //

  }
}

object Dff16e extends App {
  (new ChiselStage).emitVerilog(new Dff16e, Array("-td", "vout"))
}
