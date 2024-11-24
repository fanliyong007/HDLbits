package edu.qsng.Circuits.SequentialLogic.LatchesAndFlip_Flops
import chisel3._
class Dff extends Module{
  val d = IO(Input(UInt(1.W)))
  val q = IO(Output(UInt(1.W)))

  val tmp_q = Reg(UInt(1.W))
  q:=tmp_q
  tmp_q:=d
}
