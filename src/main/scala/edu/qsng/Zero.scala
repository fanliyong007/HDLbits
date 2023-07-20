package edu.qsng

import chisel3._
import chisel3.stage.{ChiselGeneratorAnnotation, ChiselStage}

class Zero extends Module {
  val io = IO(new Bundle {
    val zero = Output(UInt(1.W))
  })
  io.zero := 0.U
}

object Zero extends App{
  (new ChiselStage).emitVerilog(new Zero,Array("-td","vout"))
}
