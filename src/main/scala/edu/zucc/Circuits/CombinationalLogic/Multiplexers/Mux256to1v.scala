package edu.zucc.Circuits.CombinationalLogic.Multiplexers

import Chisel.Cat
import chisel3._
import chisel3.stage.ChiselStage

class Mux256to1v extends RawModule {
  val in = IO(Input(UInt(1024.W)))
  val sel = IO(Input(UInt(8.W)))
  val out = IO(Output(UInt(4.W)))

  out := Cat(in(sel * 4.U+3.U),in(sel * 4.U+2.U),in(sel * 4.U+1.U),in(sel * 4.U))
}
object Mux256to1v extends App {
  (new ChiselStage).emitVerilog(new Mux256to1v, Array("-td", "vout"))
}
