package edu.zucc.Circuits.CombinationalLogic.BasicGates

import chisel3._
import chisel3.stage.ChiselStage

class Mt2015_eq2 extends RawModule {
  val A = IO(Input(UInt(2.W)))
  val B = IO(Input(UInt(2.W)))
  val z = IO(Output(Bool()))
//  z := ~(A(0) ^ B(0)) & ~(A(1) ^ B(1)) It's ok too
  when(A === B){
    z:=true.B
  }.otherwise{
    z:=false.B
  }
}
object Mt2015_eq2 extends App {
  (new ChiselStage).emitVerilog(new Mt2015_eq2, Array("-td", "vout"))
}
