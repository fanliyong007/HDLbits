package edu.qsng.Circuits.CombinationalLogic.BasicGates

import chisel3._

class Truthtable1 extends RawModule {
  val x3 = IO(Input(Bool()))
  val x2 = IO(Input(Bool()))
  val x1 = IO(Input(Bool()))
  val f = IO(Output(Bool()))
  f := ((~x1) & x2 & (~x3)) | (x1 & x2 & (~x3)) | (x1 & (~x2) & x3) | (x1 & x2 & x3)
}

