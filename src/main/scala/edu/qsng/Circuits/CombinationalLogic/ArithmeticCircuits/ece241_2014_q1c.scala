package edu.qsng.Circuits.CombinationalLogic.ArithmeticCircuits

import chisel3._
import chisel3.stage.ChiselStage
import edu.qsng.Language.More.Adder

class ece241_2014_q1c extends Module {
  val a = IO(Input(UInt(8.W)))
  val b = IO(Input(UInt(8.W)))
  val s = IO(Output(UInt(8.W)))
  val overflow = IO(Output(Bool()))

  s := a+b
  overflow := ~( a(7) ^ b(7) ) & ( s(7) =/= a(7) )
}

object ece241_2014_q1c extends App {
  (new ChiselStage).emitVerilog(new ece241_2014_q1c, Array("-td", "vout"))
}
