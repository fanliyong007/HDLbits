package edu.qsng.Circuits.CombinationalLogic.KarnaughMapCircuit

import chisel3._

class Kmap3 extends RawModule {
  val a = IO(Input(Bool()))
  val b = IO(Input(Bool()))
  val c = IO(Input(Bool()))
  val out = IO(Output(Bool()))
  out := a | (c & ~b)

}
