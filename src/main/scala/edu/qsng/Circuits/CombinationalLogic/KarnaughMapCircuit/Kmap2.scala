package edu.qsng.Circuits.CombinationalLogic.KarnaughMapCircuit

import chisel3._

class Kmap2 extends RawModule {
  val a = IO(Input(Bool()))
  val b = IO(Input(Bool()))
  val c = IO(Input(Bool()))
  val d = IO(Input(Bool()))
  val out = IO(Output(Bool()))
  out := ((~a) & (~d)) | ((~a) & (~b) & (~c)) | (b & c & d) | (~c & a & ~b) | (d & a & ~b)
}
