package edu.qsng.Circuits.CombinationalLogic.ArithmeticCircuits

import chisel3._
import chisel3.stage.ChiselStage

class Hadd extends RawModule {
  val a = IO(Input(Bool()))
  val b = IO(Input(Bool()))
  val sum = IO(Output(Bool()))
  val cout = IO(Output(Bool()))
  sum  := a ^ b
  cout := a & b
}

object Hadd extends App {
  (new ChiselStage).emitVerilog(new Hadd, Array("-td", "vout"))
}
