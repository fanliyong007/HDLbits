package edu.qsng.Circuits.CombinationalLogic.KarnaughMapCircuit


import chisel3._
import chisel3.util.Cat


class ece241_2014_q3 extends RawModule {
  val c = IO(Input(Bool()))
  val d = IO(Input(Bool()))
  val mux_in = IO(Output(UInt(4.W)))
  mux_in := Cat(c | d,"b0".U,~d,c&d)
}

