package edu.zucc.Language.More

import chisel3.stage.ChiselStage
import chisel3.util._
import chisel3._
class Popcount255 extends Module {
  val in = IO(Input(UInt(255.W)))
  val out = IO(Output(UInt(8.W)))
  val tmp= Reg(UInt(8.W))
  var i=0
  for (i<- 0 to 254){
    when(in(i)){
      tmp:=tmp+1.U
    }.otherwise{
      tmp:=tmp
    }
  }
  out:=tmp
}
object Popcount255 extends App{
  (new ChiselStage).emitVerilog(new Popcount255,Array("-td","vout"))
}