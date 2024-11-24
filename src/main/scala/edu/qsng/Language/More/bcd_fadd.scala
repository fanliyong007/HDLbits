package edu.qsng.Language.More

import chisel3._

class bcd_fadd extends BlackBox{
  val io=IO(new Bundle{
    val a = Input(UInt(4.W))
    val b = Input(UInt(4.W))
    val cin = Input(Bool())
    val cout = Output(Bool())
    val sum = Output(UInt(4.W))
  })
}
