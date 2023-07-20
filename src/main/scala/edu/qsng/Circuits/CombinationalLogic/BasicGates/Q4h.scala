package edu.qsng.Circuits.CombinationalLogic.BasicGates

import chisel3._
import chisel3.stage.ChiselStage

class Q4h extends RawModule {
  val io = IO(new Bundle {
    val in = Input(UInt(1.W))
    val out = Output(UInt(1.W))
  })
  io.out := io.in
}

object Q4h extends App{

  (new ChiselStage).emitVerilog(new Q4h,Array("-td","vout"))
}
