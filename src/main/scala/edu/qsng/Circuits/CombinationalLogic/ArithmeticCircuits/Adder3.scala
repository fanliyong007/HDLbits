package edu.qsng.Circuits.CombinationalLogic.ArithmeticCircuits

import chisel3._
import circt.stage.ChiselStage
import edu.qsng.Language.More.Adder
import edu.qsng.Zero

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

object Adder3 extends App{
  ChiselStage.emitSystemVerilogFile(
    new Adder3,
    firtoolOpts = Array("-disable-all-randomization", "-strip-debug-info")
  )
}
