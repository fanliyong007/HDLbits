package edu.zucc.Language.Vectors

import chisel3._
import chisel3.stage.ChiselStage
import chisel3.util._

class Vector100r extends RawModule {
  val io=IO(new Bundle() {
    val in=Input(UInt(100.W))
    val out=Output(UInt(100.W))
  })
  io.out:=Reverse(io.in)
}
object Vector100r extends App{
  (new ChiselStage).emitVerilog(new Vector100r,Array("-td","vout"))
}
