package edu.qsng.Circuits.CombinationalLogic.BasicGates

import chisel3._
import chisel3.stage.ChiselStage

class Mt2015_q4a extends RawModule {
  val x = IO(Input(Bool()))
  val y = IO(Input(Bool()))
  val z = IO(Output(Bool()))
  z := ( x ^ y ) & x
}

object Mt2015_q4a extends App {
  (new ChiselStage).emitVerilog(new Mt2015_q4a, Array("-td", "vout"))
}
