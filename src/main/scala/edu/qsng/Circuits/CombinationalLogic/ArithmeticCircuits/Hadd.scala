package edu.qsng.Circuits.CombinationalLogic.ArithmeticCircuits

import chisel3._
import circt.stage.ChiselStage

class Hadd extends RawModule {
  val a = IO(Input(Bool()))
  val b = IO(Input(Bool()))
  val sum = IO(Output(Bool()))
  val cout = IO(Output(Bool()))
  sum  := a ^ b
  cout := a & b
}

object Hadd  extends App{
  ChiselStage.emitSystemVerilogFile(
    new Hadd,
    firtoolOpts = Array("-disable-all-randomization", "-strip-debug-info")
  )
}

