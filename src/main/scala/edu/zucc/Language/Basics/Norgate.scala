package edu.zucc.Language.Basics

import chisel3._
import chisel3.stage.ChiselStage

class Norgate extends RawModule {
  val io = IO(new Bundle {
    val a=Input(UInt(1.W))
    val b=Input(UInt(1.W))
    val out=Output(UInt(1.W))
  })
  io.out := ~(io.a|io.b)
}

object Norgate extends App{
  (new ChiselStage).emitVerilog(new Norgate,Array("-td","vout"))
}