package edu.qsng.Circuits.SequentialLogic.LatchesAndFlip_Flops

import chisel3._
import chisel3.stage.ChiselStage

class Dff8p extends Module {
  val d = IO(Input(UInt(8.W)))
  val q = IO(Output(UInt(8.W)))
  val u_reg = RegInit(UInt(8.W), 1.U)
  withReset(){

  }
}
object Dff8p extends App {
  (new ChiselStage).emitVerilog(new Dff8p, Array("-td", "vout"))
}
