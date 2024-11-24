package edu.qsng.Circuits.CombinationalLogic.Multiplexers


import chisel3._
import chisel3.util.Cat

class Mux256to1v extends RawModule {
  val in = IO(Input(UInt(1024.W)))
  val sel = IO(Input(UInt(8.W)))
  val out = IO(Output(UInt(4.W)))

  out := Cat(in(sel * 4.U+3.U),in(sel * 4.U+2.U),in(sel * 4.U+1.U),in(sel * 4.U))
}
