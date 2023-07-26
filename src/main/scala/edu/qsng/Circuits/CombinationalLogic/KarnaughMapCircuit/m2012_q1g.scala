package edu.qsng.Circuits.CombinationalLogic.KarnaughMapCircuit

import chisel3._
import chisel3.stage.ChiselStage

class m2012_q1g extends RawModule {
  val x = IO(Input(UInt(4.W))
  val f = IO(Output(Bool()))
  f := (x(2) & ~x(1)) | (x(1) & x(2) & x(3)) | (~x(3) & ~x(1));

}

object m2012_q1g extends App {
  (new ChiselStage).emitVerilog(new m2012_q1g, Array("-td", "vout"))
}
