package edu.qsng.Circuits.CombinationalLogic.BasicGates

import chisel3._

class Q4e extends RawModule {
  val in1 = IO(Input(UInt(1.W)))
  val in2 = IO(Input(UInt(1.W)))
  val out = IO(Output(UInt(1.W)))
  out := ~(in1 | in2)
}

