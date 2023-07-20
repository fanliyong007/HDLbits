package edu.qsng.Circuits.CombinationalLogic.ArithmeticCircuits

import chisel3._
import chisel3.stage.ChiselStage
import edu.qsng.Language.More.Adder

class ece241_2014_q1c extends Module {
  val a = IO(Input(UInt(8.W)))
  val b = IO(Input(UInt(8.W)))
  val s = IO(Output(UInt(8.W)))
  val overflow = IO(Output(Bool()))


  val myadder = Module(new Adder(8))
  myadder.io.A := a
  myadder.io.B := b
  myadder.io.Cin := 0.U
  overflow := myadder.io.Cout(7)
  s := myadder.io.Sum
}

object ece241_2014_q1c extends App {
  (new ChiselStage).emitVerilog(new ece241_2014_q1c, Array("-td", "vout"))
}
