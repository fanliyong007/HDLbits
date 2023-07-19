package edu.zucc.Circuits.CombinationalLogic.BasicGates

import chisel3._
import chisel3.stage.ChiselStage
import chisel3.util.PopCount

class Popcount3 extends RawModule {
  val in = IO(Input(UInt(3.W)))
  val out = IO(Output(UInt(2.W)))
  out := PopCount(in)
}

object Popcount3 extends App {
  (new ChiselStage).emitVerilog(new Popcount3, Array("-td", "vout"))
}
