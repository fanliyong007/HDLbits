package edu.qsng.Language.Basics

import chisel3._
class Wiredecl extends RawModule {
  val io = IO(new Bundle {
    val a=Input(UInt(1.W))
    val b=Input(UInt(1.W))
    val c=Input(UInt(1.W))
    val d=Input(UInt(1.W))
    val out=Output(UInt(1.W))
    val out_d=Output(UInt(1.W))
  })
  val tmp_wire=Wire(UInt(1.W))
  tmp_wire := (io.a&io.b)|(io.c&io.d)
  io.out := tmp_wire
  io.out_d := ~tmp_wire
}

