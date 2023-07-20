package edu.qsng.Language.Basics

import chisel3._
import chisel3.stage.ChiselStage

class Notgate extends RawModule {
  val io = IO(new Bundle {
    val in=Input(UInt(1.W))
    val out=Output(UInt(1.W))
  })
  io.out := ~io.in
}

object Notgate extends App{
  (new ChiselStage).emitVerilog(new Notgate,Array("-td","-vout"))
}
