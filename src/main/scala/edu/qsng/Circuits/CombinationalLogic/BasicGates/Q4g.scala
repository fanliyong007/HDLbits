package edu.qsng.Circuits.CombinationalLogic.BasicGates

import chisel3._
import chisel3.stage.ChiselStage

class Q4g extends RawModule {
  val in1 = IO(Input(Bool()))
  val in2 = IO(Input(Bool()))
  val in3 = IO(Input(Bool()))
  val out = IO(Output(Bool()))
  out := (~(in1 ^ in2)) ^ in3
}

object Q4g extends App{

  (new ChiselStage).emitVerilog(new Q4g,Array("-td","vout"))
}
