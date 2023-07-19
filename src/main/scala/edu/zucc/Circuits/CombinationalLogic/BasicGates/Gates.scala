package edu.zucc.Circuits.CombinationalLogic.BasicGates

import chisel3._
import chisel3.stage.ChiselStage

class Gates  extends RawModule {
  val a = IO(Input(Bool()))
  val b = IO(Input(Bool()))
  val out_and=IO(Output(Bool()))
  val out_or=IO(Output(Bool()))
  val out_xor=IO(Output(Bool()))
  val out_nand=IO(Output(Bool()))
  val out_nor=IO(Output(Bool()))
  val out_xnor=IO(Output(Bool()))
  val out_anotb=IO(Output(Bool()))
  out_and := a & b
  out_or := a | b
  out_xor := a ^ b
  out_nand := ~(a & b)
  out_nor := ~(a | b)
  out_xnor := ~(a ^ b)
  out_anotb := a & ~b
}

object Gates extends App{

  (new ChiselStage).emitVerilog(new Gates,Array("-td","vout"))
}
