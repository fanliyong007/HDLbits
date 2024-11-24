package edu.qsng.Circuits.CombinationalLogic.BasicGates

import chisel3._
class Mt2015_q4a extends RawModule {
  val x = IO(Input(Bool()))
  val y = IO(Input(Bool()))
  val z = IO(Output(Bool()))
  z := ( x ^ y ) & x
}
