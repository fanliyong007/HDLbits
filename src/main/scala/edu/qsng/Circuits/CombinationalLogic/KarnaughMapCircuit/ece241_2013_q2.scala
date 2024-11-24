package edu.qsng.Circuits.CombinationalLogic.KarnaughMapCircuit

import chisel3._

class ece241_2013_q2 extends RawModule {
  val a = IO(Input(Bool()))
  val b = IO(Input(Bool()))
  val c = IO(Input(Bool()))
  val d = IO(Input(Bool()))
  val out_sop = IO(Output(Bool()))
  val out_pos = IO(Output(Bool()))
  // 2, 7, or 15 logic 1
  //2 0010 7 0111 15 1111
  // 0, 1, 4, 5, 6, 9, 10, 13, or 14 logic 0
  //0 0000 1 0001 4 0100 5 0101 6 0110 9 1001 10 1010 13 1101 14 1110
  out_sop := (c & d) | ((~a) & (~b) & c)
  out_pos := (c) & ((~a) | b) & (d | (~b))
}
