package edu.qsng.Circuits.SequentialLogic.LatchesAndFlip_Flops

import chisel3._
import circt.stage.ChiselStage

class m2014_q4d extends Module with ImplicitClock{
  val clk = IO(Input(Clock()))
  val in = IO(Input(Bool()))
  val out = IO(Output(Bool()))
  override protected def implicitClock = clk

  val myReg = Reg(UInt(1.W))
  val inXorout = in ^ out
  myReg := inXorout
  out := myReg

}