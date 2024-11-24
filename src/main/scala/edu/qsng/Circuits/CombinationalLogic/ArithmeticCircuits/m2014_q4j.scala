package edu.qsng.Circuits.CombinationalLogic.ArithmeticCircuits

import chisel3._
import edu.qsng.Language.More.Adder

class m2014_q4j extends Module {
  val x = IO(Input(UInt(4.W)))
  val y = IO(Input(UInt(4.W)))
  val sum = IO(Output(UInt(5.W)))
  val myadder = Module(new Adder(5))
  myadder.io.Cin := 0.U
  myadder.io.A := x
  myadder.io.B := y
  sum := myadder.io.Sum
  val tmp = myadder.io.Cout
}

