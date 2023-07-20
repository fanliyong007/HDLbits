package edu.qsng.Circuits.CombinationalLogic.BasicGates

import chisel3._
import chisel3.stage.ChiselStage

class Q4f extends RawModule {
  val in1 = IO(Input(Bool()))
  val in2 = IO(Input(Bool()))
  val out = IO(Output(Bool()))
  out := in1 & (~in2)
}

object Q4f extends App{

  (new ChiselStage).emitVerilog(new Q4f,Array("-td","vout"))
}
