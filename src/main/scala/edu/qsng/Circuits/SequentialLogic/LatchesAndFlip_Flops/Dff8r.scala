package edu.qsng.Circuits.SequentialLogic.LatchesAndFlip_Flops

import chisel3._

class Dff8r extends Module {
  val d = IO(Input(UInt(8.W)))
  val q = IO(Output(UInt(8.W)))
  val u_reg = RegInit(UInt(8.W),0.U)
  u_reg := d
  q := u_reg
}
