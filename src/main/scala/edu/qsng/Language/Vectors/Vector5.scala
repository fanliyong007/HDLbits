package edu.qsng.Language.Vectors

import chisel3._
import chisel3.stage.ChiselStage
import chisel3.util._

class Vector5 extends RawModule {
  val a = IO(Input(UInt(1.W)))
  val b = IO(Input(UInt(1.W)))
  val c = IO(Input(UInt(1.W)))
  val d = IO(Input(UInt(1.W)))
  val e = IO(Input(UInt(1.W)))
  val out = IO(Output(UInt(25.W)))
  val tmpa = Wire(UInt(25.W))
  val tmpb = Wire(UInt(25.W))
  tmpa := Cat(Fill(5,a),Fill(5,b),Fill(5,c),Fill(5,d),Fill(5,e))
  tmpb := Fill(5,Cat(a,b,c,d,e))
  out  := ~(tmpa ^ tmpb)
}
object Vector5 extends App{
  (new ChiselStage).emitVerilog(new Vector5,Array("-td","vout"))
}