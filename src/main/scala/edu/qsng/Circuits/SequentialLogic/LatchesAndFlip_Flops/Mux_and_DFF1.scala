package edu.qsng.Circuits.SequentialLogic.LatchesAndFlip_Flops

import chisel3._
import circt.stage.ChiselStage

class Mux_and_DFF1 extends Module with ImplicitClock {
  val clk = IO(Input(Clock()))
  val L = IO(Input(Bool()))
  val r_in = IO(Input(Bool()))
  val q_in = IO(Input(Bool()))
  val Q = IO(Output(Bool()))
  override protected def implicitClock = clk
  val QReg = Reg(UInt(1.W))
  when(L){
    QReg := r_in
  }.otherwise{
    QReg := q_in
  }
  Q := QReg
}