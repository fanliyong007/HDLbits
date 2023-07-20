package edu.qsng.Language.Procedures

import chisel3.stage.ChiselStage
import chisel3.util._
import chisel3._

class Alwaysblock1 extends Module {
  val a = IO(Input(UInt(1.W)))
  val b = IO(Input(UInt(1.W)))
  val out_assign = IO(Output(UInt(1.W)))
  val out_alwaysblock = IO(Output(UInt(1.W)))

  val tmp=Reg(UInt(1.W))
  out_assign := a & b
  tmp := a & b
  out_alwaysblock := tmp
}

object Alwaysblock1 extends App{
  (new ChiselStage).emitVerilog(new Alwaysblock1,Array("-td","vout"))
}