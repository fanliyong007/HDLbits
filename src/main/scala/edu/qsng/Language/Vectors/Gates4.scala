package edu.qsng.Language.Vectors

import chisel3._

class Gates4 extends RawModule {
  val io = IO(new Bundle {
    val in=Input(UInt(4.W))
    val out_and=Output(UInt(1.W))
    val out_or=Output(UInt(1.W))
    val out_xor=Output(UInt(1.W))
  })
  io.out_and := io.in(0)&io.in(1)&io.in(2)&io.in(3)
  io.out_or  := io.in(0)|io.in(1)|io.in(2)|io.in(3)
  io.out_xor := io.in(0)^io.in(1)^io.in(2)^io.in(3)
}