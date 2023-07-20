package edu.qsng.Circuits.CombinationalLogic.BasicGates

import chisel3._
import chisel3.stage.ChiselStage

class Mt2015_q4b extends RawModule {
  val x = IO(Input(Bool()))
  val y = IO(Input(Bool()))
  val z = IO(Output(Bool()))
  z := ~ (x ^ y)
}

object Mt2015_q4b extends App {
  (new ChiselStage).emitVerilog(new Mt2015_q4b, Array("-td", "vout"))
}
