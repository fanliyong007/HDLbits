package edu.qsng.Circuits.CombinationalLogic.Multiplexers

import chisel3._

class Mux2to1v extends RawModule {
  val a = IO(Input(UInt(100.W)))
  val b = IO(Input(UInt(100.W)))
  val sel=IO(Input(Bool()))
  val out = IO(Output(UInt(100.W)))
  out := Mux(sel,b,a)
}
