package edu.qsng.Circuits.CombinationalLogic.BasicGates

import chisel3._
import chisel3.stage.ChiselStage

class Q4i extends RawModule {
  val out = IO(Output(Bool()))
  out := false.B
}

object Q4i extends App{

  (new ChiselStage).emitVerilog(new Q4i,Array("-td","vout"))
}
