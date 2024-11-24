package edu.qsng.Circuits.CombinationalLogic.BasicGates

import chisel3._

class Q4i extends RawModule {
  val out = IO(Output(Bool()))
  out := false.B
}
