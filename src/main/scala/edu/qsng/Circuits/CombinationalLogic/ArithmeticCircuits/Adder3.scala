package edu.qsng.Circuits.CombinationalLogic.ArithmeticCircuits

import chisel3._
import chisel3.stage.ChiselStage
import edu.qsng.Language.More.Adder

class Adder3 extends Module {
  val a = IO(Input(UInt(3.W)))
  val b = IO(Input(UInt(3.W)))
  val cin = IO(Input(UInt(1.W)))
  val cout = IO(Output(UInt(3.W)))
  val sum = IO(Output(UInt(3.W)))

  val myadder = Module(new Adder(3))
  myadder.io.A := a
  myadder.io.B := b
  myadder.io.Cin := cin
  cout := myadder.io.Cout
  sum := myadder.io.Sum
}

object Adder3 extends App {
  (new ChiselStage).emitVerilog(new Adder3, Array("-td", "vout"))
}
