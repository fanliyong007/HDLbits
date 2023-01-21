package edu.zucc.Language.Vectors

import chisel3._
import chisel3.stage.ChiselStage
import chisel3.util._
class Vectorr extends RawModule {
  val io=IO(new Bundle() {
    val in=Input(UInt(8.W))
    val out=Output(UInt(8.W))
  })
  io.out:=Reverse(io.in)
}
object Vectorr extends App{
  (new ChiselStage).emitVerilog(new Vectorr,Array("-td","vout"))
}
