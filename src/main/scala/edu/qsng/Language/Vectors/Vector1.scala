package edu.qsng.Language.Vectors

import chisel3._

class Vector1 extends Module {
  val io=IO(new Bundle() {
    val in =Input(UInt(16.W))
    val out_hi=Output(UInt(8.W))
    val out_lo=Output(UInt(8.W))
  })
  io.out_hi := io.in(15,8)
  io.out_lo := io.in(7,0)
}