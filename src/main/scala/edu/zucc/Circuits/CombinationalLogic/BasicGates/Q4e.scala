package edu.zucc.Circuits.CombinationalLogic.BasicGates

import chisel3._
import chisel3.stage.ChiselStage

class Q4e extends RawModule {
  val in1 = IO(Input(UInt(1.W)))
  val in2 = IO(Input(UInt(1.W)))
  val out = IO(Output(UInt(1.W)))
  out := ~(in1 | in2)
}

object Q4e extends App{

  (new ChiselStage).emitVerilog(new Q4e,Array("-td","vout"))
}
