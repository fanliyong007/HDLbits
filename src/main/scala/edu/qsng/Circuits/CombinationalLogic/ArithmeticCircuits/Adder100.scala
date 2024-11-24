package edu.qsng.Circuits.CombinationalLogic.ArithmeticCircuits

import chisel3._
import circt.stage.ChiselStage
import edu.qsng.Language.More.Adder
import edu.qsng.Zero

class Adder100 extends Module {
  val a = IO(Input(UInt(100.W)))
  val b = IO(Input(UInt(100.W)))
  val cin = IO(Input(Bool()))
  val cout = IO(Output(Bool()))
  val sum = IO(Output(UInt(100.W)))

  val myadder = Module(new Adder(100))
  myadder.io.A := a
  myadder.io.B := b
  myadder.io.Cin := cin
  cout := myadder.io.Cout(99)
  sum := myadder.io.Sum
}

object Adder100 extends App{
  ChiselStage.emitSystemVerilogFile(
    new Adder100,
    firtoolOpts = Array("-disable-all-randomization", "-strip-debug-info")
  )
}

