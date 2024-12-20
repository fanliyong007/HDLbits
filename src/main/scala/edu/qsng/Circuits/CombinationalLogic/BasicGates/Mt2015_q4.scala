package edu.qsng.Circuits.CombinationalLogic.BasicGates

import chisel3._

class Mt2015_q4 extends RawModule {
  val x = IO(Input(Bool()))
  val y = IO(Input(Bool()))
  val z = IO(Output(Bool()))
  val A1=Wire(Bool())
  val A2=Wire(Bool())
  val B1=Wire(Bool())
  val B2=Wire(Bool())
  A1:= ( x ^ y ) & x
  B1:= ( x ^ y ) & x
  A2:= ~ (x ^ y)
  B2:= ~ (x ^ y)
  z:=(A1 | B1) ^ (A2 & B2)
}
