package edu.qsng.Language.Vectors

import chisel3._

class Vector0 extends RawModule {
  val io = IO(new Bundle {
    val vec=Input(UInt(3.W))
    val outv=Output(UInt(3.W))
    val o2=Output(UInt(1.W))
    val o1=Output(UInt(1.W))
    val o0=Output(UInt(1.W))
  })
  io.outv:=io.vec
  io.o2:=io.vec(2)
  io.o1:=io.vec(1)
  io.o0:=io.vec(0)
}