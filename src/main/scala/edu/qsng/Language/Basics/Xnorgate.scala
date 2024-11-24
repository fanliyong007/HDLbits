package edu.qsng.Language.Basics

import chisel3._
class Xnorgate extends RawModule {
  val io = IO(new Bundle {
    val a=Input(UInt(1.W))
    val b=Input(UInt(1.W))
    val out=Output(UInt(1.W))
  })
  io.out := ~(io.a^io.b)
}
