package edu.qsng.Circuits.CombinationalLogic.KarnaughMapCircuit

import chisel3._
import chisel3.stage.ChiselStage

class Kmap1 extends RawModule {
  val a = IO(Input(Bool()))
  val b = IO(Input(Bool()))
  val c = IO(Input(Bool()))
  val out = IO(Output(Bool()))

}

object Kmap1 extends App {
  (new ChiselStage).emitVerilog(new Kmap1, Array("-td", "vout"))
}
