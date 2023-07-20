package edu.qsng.Language.Module

import chisel3._
import chisel3.stage.ChiselStage
import chisel3.util._

class Vectorxxx extends Module {
  val io=IO(new Bundle() {
    val in =Input(UInt(16.W))
    val out_hi=Output(UInt(8.W))
    val out_lo=Output(UInt(8.W))
  })
  io.out_hi := io.in(15,8)
  io.out_lo := io.in(7,0)
}

class MyModule extends Module{
  val io=IO(new Bundle{
    val a=Output(UInt(8.W))
    val b=Output(UInt(8.W))
    val in=Input(UInt(16.W))
  })
  val modA = Module(new Vectorxxx())
  modA.io.in:=io.in
  io.a:=modA.io.out_hi
  io.b:=modA.io.out_lo
}

object MyModule extends App{
  (new ChiselStage).emitVerilog(new MyModule,Array("-td","vout"))
}

