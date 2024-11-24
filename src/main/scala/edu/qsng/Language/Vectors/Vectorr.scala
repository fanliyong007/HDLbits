package edu.qsng.Language.Vectors

import chisel3._
import chisel3.util._
class Vectorr extends RawModule {
  val io=IO(new Bundle() {
    val in=Input(UInt(8.W))
    val out=Output(UInt(8.W))
  })
  io.out:=Reverse(io.in)
}