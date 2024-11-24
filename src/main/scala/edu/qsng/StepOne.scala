package edu.qsng

import chisel3._

class StepOne extends Module {
  val io = IO(new Bundle {
    val one = Output(UInt(1.W))
  })
  io.one := 1.U
}
