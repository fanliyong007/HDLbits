package edu.zucc.Circuits.CombinationalLogic.BasicGates

import Chisel.Cat
import chisel3._
import chisel3.stage.ChiselStage

class Gatesv extends RawModule {

  val in = IO(Input(UInt(4.W)))
  val out_both = IO(Output(UInt(3.W)))
  val out_any = IO(Output(UInt(3.W)))
  val out_different = IO(Output(UInt(4.W)))
  out_both := Cat(in(3)&in(2),in(2)&in(1),in(1)&in(0))
  out_any := Cat(in(3)|in(2),in(2)|in(1),in(1)|in(0))
  out_different := Cat(
    Mux(in(0)===in(3),false.B,true.B),
    Mux(in(3)===in(2),false.B,true.B),
    Mux(in(2)===in(1),false.B,true.B),
    Mux(in(1)===in(0),false.B,true.B))

}

object Gatesv extends App {
  (new ChiselStage).emitVerilog(new Gatesv, Array("-td", "vout"))
}
