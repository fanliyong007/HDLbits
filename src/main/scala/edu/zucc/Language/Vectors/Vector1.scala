package edu.zucc.Language.Vectors

import chisel3._
import chisel3.stage.ChiselStage

class Vector1 extends Module {
  val io=IO(new Bundle() {
    val in =Input(UInt(16.W))
    val out_hi=Output(UInt(8.W))
    val out_lo=Output(UInt(8.W))
  })
  io.out_hi := io.in(15,8)
  io.out_lo := io.in(7,0)
}

object Vector1 extends App{
  (new ChiselStage).emitVerilog(new Vector1,Array("-td","vout"))
}