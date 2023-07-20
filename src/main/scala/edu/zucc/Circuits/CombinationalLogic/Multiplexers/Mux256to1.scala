package edu.zucc.Circuits.CombinationalLogic.Multiplexers

import chisel3._
import chisel3.stage.ChiselStage

class Mux256to1 extends RawModule {
  val in = IO(Input(UInt(256.W)))
  val sel = IO(Input(UInt(8.W)))
  val out = IO(Output(Bool()))
  out:=in(sel)
}

object Mux256to1 extends App {
  (new ChiselStage).emitVerilog(new Mux256to1, Array("-td", "vout"))
}
