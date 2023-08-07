package edu.qsng.Circuits.SequentialLogic.LatchesAndFlip_Flops

import chisel3._
import chisel3.stage.ChiselStage

class Dff8ar  extends RawModule {
  val clk = IO(Input(Clock()))
  val areset = IO(Input(Bool()))
  val d = IO(Input(UInt(8.W)))
  val q = IO(Output(UInt(8.W)))
  //(~clk.asUInt).asBool.asClock can  be triggered by the negative edge of clk.
  withClockAndReset(areset.asClock,areset){
    withClock(clk) {
      val myReg = Reg(UInt(8.W))
      when(areset) {
        myReg := 0.U
      }.otherwise {
        myReg := d
      }
      q := myReg
    }
  }

}

object Dff8ar extends App {
  (new ChiselStage).emitVerilog(new Dff8ar, Array("-td", "vout"))
}
