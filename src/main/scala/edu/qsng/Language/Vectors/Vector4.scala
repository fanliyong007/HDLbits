package edu.qsng.Language.Vectors

import chisel3._
import chisel3.stage.ChiselStage
import chisel3.util._

class Vector4 extends RawModule {
  //  val in = IO(Input(UInt(8.W)))
//  val out = IO(Output(UInt(32.W)))//create I/O without a prefix
//
//  out:=Cat(Fill(24,in(7)),in)//Fill(n, x) 位向量x复制n次
  val in = IO(Input(SInt(8.W)))
  val out = IO(Output(SInt(32.W)))
  out:=in//easy way to right shift
}
object Vector4 extends App{
  (new ChiselStage).emitVerilog(new Vector4,Array("-td","vout"))
}