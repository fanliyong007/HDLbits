package edu.qsng.Circuits.CombinationalLogic.KarnaughMapCircuit

import chisel3._
import chisel3.stage.ChiselStage

class ece241_2013_q2 extends RawModule {
  val a = IO(Input(Bool()))
  val b = IO(Input(Bool()))
  val c = IO(Input(Bool()))
  val d = IO(Input(Bool()))
  val out_sop = IO(Output(Bool()))
  val out_pos = IO(Output(Bool()))

}

object ece241_2013_q2 extends App {
  (new ChiselStage).emitVerilog(new ece241_2013_q2, Array("-td", "vout"))
}
