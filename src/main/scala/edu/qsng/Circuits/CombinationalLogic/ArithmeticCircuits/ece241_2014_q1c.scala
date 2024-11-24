package edu.qsng.Circuits.CombinationalLogic.ArithmeticCircuits

import chisel3._
import circt.stage.ChiselStage

class ece241_2014_q1c extends Module {
  val a = IO(Input(UInt(8.W)))
  val b = IO(Input(UInt(8.W)))
  val s = IO(Output(UInt(8.W)))
  val overflow = IO(Output(Bool()))

  s := a+b
  overflow := ~( a(7) ^ b(7) ) & ( s(7) =/= a(7) )
}

object ece241_2014_q1c extends App{
  ChiselStage.emitSystemVerilogFile(
    new ece241_2014_q1c,
    firtoolOpts = Array("-disable-all-randomization", "-strip-debug-info")
  )
}
