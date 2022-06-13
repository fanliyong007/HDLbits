package edu.zucc.Language.Vectors

import Chisel.Cat
import chisel3._
import chisel3.stage.ChiselStage

class Vector2 extends RawModule{
  val io=IO(new Bundle() {
    val in=Input(UInt(32.W))
    val out=Output(UInt(32.W))
  })
  val x = Wire(UInt(8.W))
  x := io.in(7,0)
  for(i<- 0 to 24){
    x := Cat(x,io.in(i+7,i))
  }
  io.out := x
  //io.out := Cat(io.in(7,0),io.in(15,8),io.in(23,16),io.in(31,24))
  //Wrong!!!
  //  io.out(31,24) := io.in(7,0)
  //  io.out(23,16) := io.in(15,8)
  //  io.out(15,8) := io.in(23,16)
  //  io.out(7,0) := io.in(31,24)
}

object Vector2 extends App{
  (new ChiselStage).emitVerilog(new Vector2,Array("-td","vout"))
}