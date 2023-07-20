package edu.qsng.Circuits.CombinationalLogic.ArithmeticCircuits

import chisel3._
import chisel3.stage.ChiselStage

class Fadd extends RawModule {
  val a = IO(Input(Bool()))
  val b = IO(Input(Bool()))
  val cin = IO(Input(Bool()))
  val sum = IO(Output(Bool()))
  val cout = IO(Output(Bool()))

  sum := a ^ b ^ cin
  cout:= a & b | a & cin | b & cin
}

object Fadd extends App {
  (new ChiselStage).emitVerilog(new Fadd, Array("-td", "vout"))
}
