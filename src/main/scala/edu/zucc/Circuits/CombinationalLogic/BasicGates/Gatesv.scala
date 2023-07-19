package edu.zucc.Circuits.CombinationalLogic.BasicGates

import chisel3._
import chisel3.stage.ChiselStage

class Gatesv extends RawModule {

  val in = IO(Input(UInt(4.W)))
  val out_both = IO(Output(UInt(3.W)))
  val out_any = IO(Output(UInt(3.W)))
  val out_different = IO(Output(UInt(4.W)))

}

object Gatesv extends App {
  (new ChiselStage).emitVerilog(new Gatesv, Array("-td", "vout"))
}
