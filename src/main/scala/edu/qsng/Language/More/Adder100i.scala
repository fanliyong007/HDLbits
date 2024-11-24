package edu.qsng.Language.More
//Create a 100-bit binary ripple-carry adder by instantiating 100 full adders.
//  The adder adds two 100-bit numbers and a carry-in to produce a 100-bit sum and carry out.
//  To encourage you to actually instantiate full adders, also output the carry-out from each full adder
//in the ripple-carry adder. cout[99] is the final carry-out from the last full adder,
// and is the carry-out you usually see.
import chisel3.util._
import chisel3._
import chisel3.internal.firrtl.Width

import java.awt.MouseInfo
class Adder100i extends Module {
  val a = IO(Input(UInt(100.W)))
  val b = IO(Input(UInt(100.W)))
  val cin = IO(Input(UInt(1.W)))
  val cout = IO(Output(UInt(100.W)))
  val sum = IO(Output(UInt(100.W)))

  val myadder = Module(new Adder(100))
  myadder.io.A := a
  myadder.io.B := b
  myadder.io.Cin := cin
  cout := myadder.io.Cout
  sum := myadder.io.Sum
}

