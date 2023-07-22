package edu.qsng.Circuits.CombinationalLogic.KarnaughMapCircuit

import chisel3._
import chisel3.stage.ChiselStage

class kmap4 extends RawModule {
  val a = IO(Input(Bool()))
  val b = IO(Input(Bool()))
  val c = IO(Input(Bool()))
  val d = IO(Input(Bool()))
  val out = IO(Output(Bool()))
  out := a ^ b ^ c ^d
}

object kmap4 extends App {
  (new ChiselStage).emitVerilog(new kmap4, Array("-td", "vout"))
}
