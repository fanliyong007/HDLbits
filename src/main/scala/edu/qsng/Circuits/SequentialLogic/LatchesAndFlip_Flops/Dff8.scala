package edu.qsng.Circuits.SequentialLogic.LatchesAndFlip_Flops

import chisel3._

class Dff8 extends Module {
  val d = IO(Input(UInt(8.W)))
  val q = IO(Output(UInt(8.W)))
  val u_reg = Reg(UInt(8.W))
  u_reg := d
  q := u_reg
}
