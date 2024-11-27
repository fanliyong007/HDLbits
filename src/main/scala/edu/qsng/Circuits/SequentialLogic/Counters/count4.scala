package edu.qsng.Circuits.SequentialLogic.Counters

import chisel3._

class count4 extends BlackBox{
  val io=IO(new Bundle {
    val clk = IO(Input(Clock()))
    val enable,load = IO(Input(Bool()))
    val d = IO(Input(UInt(4.W)))
    val Q= IO(Output(UInt(4.W)))
  })
}
