package edu.qsng.Circuits.CombinationalLogic.KarnaughMapCircuit

import chisel3._
import chisel3.stage.ChiselStage

class m2014_q3 extends RawModule {
  val x = IO(Input(UInt(4.W)))
  val f = IO(Output(Bool()))
  f := (x(2) & ~x(0)) | (~x(2) & x(0) & x(1))
}

object m2014_q3 extends App {
  (new ChiselStage).emitVerilog(new m2014_q3, Array("-td", "vout"))
}
