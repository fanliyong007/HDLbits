package edu.qsng.Circuits.CombinationalLogic.Multiplexers

import chisel3._

class Mux256to1 extends RawModule {
  val in = IO(Input(UInt(256.W)))
  val sel = IO(Input(UInt(8.W)))
  val out = IO(Output(Bool()))
  out:=in(sel)
}

