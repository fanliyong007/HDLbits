package edu.qsng.Language.Basics

import chisel3._

class Chip_7458 extends RawModule {
  val io = IO(new Bundle {
    val p1a = Input(UInt(1.W))
    val p1b = Input(UInt(1.W))
    val p1c = Input(UInt(1.W))
    val p1d = Input(UInt(1.W))
    val p1e = Input(UInt(1.W))
    val p1f = Input(UInt(1.W))
    val p1y = Output(UInt(1.W))

    val p2a = Input(UInt(1.W))
    val p2b = Input(UInt(1.W))
    val p2c = Input(UInt(1.W))
    val p2d = Input(UInt(1.W))
    val p2y = Output(UInt(1.W))
  })
  io.p1y := (io.p1a&io.p1b&io.p1c)|(io.p1d&io.p1e&io.p1f)
  io.p2y := (io.p2a&io.p2b)|(io.p2c&io.p2d)
}
