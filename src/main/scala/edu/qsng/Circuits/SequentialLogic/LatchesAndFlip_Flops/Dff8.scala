package edu.qsng.Circuits.SequentialLogic.LatchesAndFlip_Flops

import chisel3._
import chisel3.stage.ChiselStage

class Dff8 extends Module {
  val d = IO(Input(UInt(8.W)))
  val q = IO(Output(UInt(8.W)))
  val u_reg = Reg(UInt(8.W))
  u_reg := d
  q := u_reg
}

object Dff8 extends App {
  (new ChiselStage).emitVerilog(new Dff8, Array("-td", "vout"))
}
