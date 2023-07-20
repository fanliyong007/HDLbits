package edu.qsng.Circuits.CombinationalLogic.Multiplexers

import chisel3._
import chisel3.stage.ChiselStage

class Mux2to1 extends RawModule {
  val a = IO(Input(Bool()))
  val b = IO(Input(Bool()))
  val sel = IO(Input(Bool()))
  val out = IO(Output(Bool()))
  out:=Mux(sel,b,a)
}

object Mux2to1 extends App {
  (new ChiselStage).emitVerilog(new Mux2to1, Array("-td", "vout"))
}
