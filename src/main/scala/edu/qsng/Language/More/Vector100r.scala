package edu.qsng.Language.Vectors

import chisel3._
import chisel3.util._

class Vector100r extends RawModule {
  val io=IO(new Bundle() {
    val in=Input(UInt(100.W))
    val out=Output(UInt(100.W))
  })
  io.out:=Reverse(io.in)
}