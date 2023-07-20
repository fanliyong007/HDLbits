package edu.qsng.Circuits.CombinationalLogic.Multiplexers

import chisel3._
import chisel3.stage.ChiselStage

class Mux2to1v extends RawModule {
  val a = IO(Input(UInt(100.W)))
  val b = IO(Input(UInt(100.W)))
  val sel=IO(Input(Bool()))
  val out = IO(Output(UInt(100.W)))
  out := Mux(sel,b,a)
}

object Mux2to1v extends App {
  (new ChiselStage).emitVerilog(new Mux2to1v, Array("-td", "vout"))
}