package edu.qsng.Circuits.CombinationalLogic.BasicGates

import chisel3._

class Ringer extends RawModule {
  val ring = IO(Input(Bool()))
  val vibrate_mode = IO(Input(Bool()))
  val ringer = IO(Output(Bool()))
  val motor = IO(Output(Bool()))
  motor := ring & vibrate_mode
  ringer := ring & ~(vibrate_mode)
}
