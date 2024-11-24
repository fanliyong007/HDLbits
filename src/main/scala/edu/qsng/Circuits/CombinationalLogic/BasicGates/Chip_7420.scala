package edu.qsng.Circuits.CombinationalLogic.BasicGates

import chisel3._

class Chip_7420 extends RawModule {
  val p1a = IO(Input(Bool()))
  val p1b = IO(Input(Bool()))
  val p1c = IO(Input(Bool()))
  val p1d = IO(Input(Bool()))
  val p1y = IO(Output(Bool()))
  val p2a = IO(Input(Bool()))
  val p2b = IO(Input(Bool()))
  val p2c = IO(Input(Bool()))
  val p2d = IO(Input(Bool()))
  val p2y = IO(Output(Bool()))
  p1y := ~(p1a & p1b & p1c & p1d)
  p2y := ~(p2a & p2b & p2c & p2d)
}
