package edu.qsng.Language.Basics

import chisel3._
import chisel3.stage.ChiselStage

class Andgate extends RawModule {
    val a=IO(Input(UInt(1.W)))
    val b=IO(Input(UInt(1.W)))
    val out=IO(Output(UInt(1.W)))

  out := a&b
}

object Andgate extends App{
  (new ChiselStage).emitVerilog(new Andgate,Array("-td","vout"))
}