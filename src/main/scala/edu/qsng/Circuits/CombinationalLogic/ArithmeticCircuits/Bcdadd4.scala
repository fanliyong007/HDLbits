package edu.qsng.Circuits.CombinationalLogic.ArithmeticCircuits

import Chisel.Cat
import chisel3.{Wire, _}
import chisel3.stage.ChiselStage
import edu.qsng.Language.More.bcd_fadd

class Bcdadd4 extends RawModule {
  val a = IO(Input(UInt(16.W)))
  val b = IO(Input(UInt(16.W)))
  val cin = IO(Input(Bool()))
  val cout = IO(Output(Bool()))
  val sum = IO(Output(UInt(16.W)))

  val u_bcd_fadd = Array.fill(4)(Module(new bcd_fadd()).io)
  val bcd_sum = Wire(Vec(4, UInt(4.W)))
  val bcd_carry = Wire(Vec(5, Bool()))

  bcd_carry(0) := cin
  for (i <- 0 until 4) {
    u_bcd_fadd(i).a := Cat(a(i * 4 + 3), a(i * 4 + 2), a(i * 4 + 1), a(i * 4))
    u_bcd_fadd(i).b := Cat(b(i * 4 + 3), b(i * 4 + 2), b(i * 4 + 1), b(i * 4))
    u_bcd_fadd(i).cin := bcd_carry(i)
    bcd_carry(i + 1) := u_bcd_fadd(i).cout
    bcd_sum(i) := u_bcd_fadd(i).sum
  }
  cout := bcd_carry(4)
  sum := bcd_sum.asUInt
}


object Bcdadd4 extends App {
  (new ChiselStage).emitVerilog(new Bcdadd4, Array("-td", "vout"))
}
