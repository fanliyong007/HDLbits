package edu.qsng.Language.More

import chisel3.stage.ChiselStage
import chisel3.util._
import chisel3._
class Gates100 extends RawModule {
  val in = IO(Input(UInt(100.W)))
  val out_and = IO(Output(UInt(1.W)))
  val out_or = IO(Output(UInt(1.W)))
  val out_xor = IO(Output(UInt(1.W)))

  out_and :=in.andR
  out_or :=in.orR
  out_xor :=in.xorR
}
object Gates100 extends App{
  (new ChiselStage).emitVerilog(new Gates100,Array("-td","vout"))
}