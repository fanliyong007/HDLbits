package edu.qsng.Circuits.SequentialLogic.LatchesAndFlip_Flops

import chisel3._
import chisel3.stage.ChiselStage

class Dff8r extends Module {
  val d = IO(Input(UInt(8.W)))
  val q = IO(Output(UInt(8.W)))
  val u_reg = RegInit(UInt(8.W),0.U)
  u_reg := d
  q := u_reg 
}

object Dff8r extends App {
  (new ChiselStage).emitVerilog(new Dff8r, Array("-td", "vout"))
}
