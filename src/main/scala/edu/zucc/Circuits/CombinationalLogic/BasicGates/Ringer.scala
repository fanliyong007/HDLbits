package edu.zucc.Circuits.CombinationalLogic.BasicGates

import chisel3._
import chisel3.stage.ChiselStage

class Ringer extends RawModule {
  val ring = IO(Input(Bool()))
  val vibrate_mode = IO(Input(Bool()))
  val ringer = IO(Output(Bool()))
  val motor = IO(Output(Bool()))
  motor := ring & vibrate_mode
  ringer := ring & ~(vibrate_mode)
}

object Ringer extends App {
  (new ChiselStage).emitVerilog(new Ringer, Array("-td", "vout"))
}
