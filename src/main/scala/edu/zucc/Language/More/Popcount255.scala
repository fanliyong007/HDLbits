package edu.zucc.Language.More

import chisel3.stage.ChiselStage
import chisel3.util._
import chisel3._
class Popcount255 extends RawModule {
  val in = IO(Input(UInt(255.W)))
  val out = IO(Output(UInt(8.W)))
  out:=PopCount(in)
}
object Popcount255 extends App{
  (new ChiselStage).emitVerilog(new Popcount255,Array("-td","vout"))
}