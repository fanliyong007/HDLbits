package edu.qsng.Circuits.CombinationalLogic.KarnaughMapCircuit

import chisel3._
import chisel3.stage.ChiselStage

class Kmap3 extends RawModule {
  val a = IO(Input(Bool()))
  val b = IO(Input(Bool()))
  val out = IO(Output(Bool()))
}

object Kmap3 extends App {
  (new ChiselStage).emitVerilog(new Kmap3, Array("-td", "vout"))
}
