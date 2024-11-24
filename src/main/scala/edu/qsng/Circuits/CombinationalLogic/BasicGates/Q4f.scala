package edu.qsng.Circuits.CombinationalLogic.BasicGates

import chisel3._

class Q4f extends RawModule {
  val in1 = IO(Input(Bool()))
  val in2 = IO(Input(Bool()))
  val out = IO(Output(Bool()))
  out := in1 & (~in2)
}
