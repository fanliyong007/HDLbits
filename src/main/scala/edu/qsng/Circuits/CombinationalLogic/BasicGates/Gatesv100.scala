package edu.qsng.Circuits.CombinationalLogic.BasicGates

import chisel3._
import chisel3.stage.ChiselStage
import chisel3.util.Cat

class Gatesv100 extends RawModule {
  val in = IO(Input(UInt(100.W)))
  val out_both = IO(Output(UInt(99.W)))
  val out_any = IO(Output(UInt(99.W)))
  val out_different = IO(Output(UInt(100.W)))
  out_both      := in(98,0) & in(99,1)
  out_any      := in(99,1) | in(98,0)
  out_different := in(99,0) ^ Cat(in(0),in(99,1))
}

object Gatesv100 extends App {
  (new ChiselStage).emitVerilog(new Gatesv100, Array("-td", "vout"))
}
