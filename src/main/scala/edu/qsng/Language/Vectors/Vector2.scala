package edu.qsng.Language.Vectors

import chisel3._
import chisel3.util.Cat

class Vector2 extends RawModule{
  val io=IO(new Bundle() {
    val in=Input(UInt(32.W))
    val out=Output(UInt(32.W))
  })
    io.out := Cat(io.in(7,0),io.in(15,8),io.in(23,16),io.in(31,24))
}
