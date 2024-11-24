package edu.qsng.Circuits.CombinationalLogic.BasicGates

import chisel3._

class Mt2015_q4b extends RawModule {
  val x = IO(Input(Bool()))
  val y = IO(Input(Bool()))
  val z = IO(Output(Bool()))
  z := ~ (x ^ y)
}
