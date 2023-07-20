package edu.zucc.Circuits.CombinationalLogic.Multiplexers

import chisel3._
import chisel3.stage.ChiselStage
import chisel3.util.{MuxCase, is, switch}

class Mux9to1v extends RawModule {
  val a = IO(Input(UInt(16.W)))
  val b = IO(Input(UInt(16.W)))
  val c = IO(Input(UInt(16.W)))
  val d = IO(Input(UInt(16.W)))
  val e = IO(Input(UInt(16.W)))
  val f = IO(Input(UInt(16.W)))
  val g = IO(Input(UInt(16.W)))
  val h = IO(Input(UInt(16.W)))
  val i = IO(Input(UInt(16.W)))
  val sel = IO(Input(UInt(4.W)))
  val out = IO(Output(UInt(16.W)))
  out:=MuxCase("b1111111111111111".U,
    Array((sel === 0.U) -> a,
      (sel === 1.U) -> b,
      (sel === 2.U) -> c,
      (sel === 3.U) -> d,
      (sel === 4.U) -> e,
      (sel === 5.U) -> f,
      (sel === 6.U) -> g,
      (sel === 7.U) -> h,
      (sel === 8.U) -> i))
}

object Mux9to1v extends App {
  (new ChiselStage).emitVerilog(new Mux9to1v, Array("-td", "vout"))
}
