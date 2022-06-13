package edu.zucc.Language.Vectors

import Chisel.Cat
import chisel3._
import chisel3.stage.ChiselStage

class Vectorgates extends RawModule {
  val io=IO(new Bundle() {
    val a=Input(UInt(3.W))
    val b=Input(UInt(3.W))
    val out_or_bitwise=Output(UInt(3.W))
    val out_or_logical=Output(Bool())
    val out_not=Output(UInt(6.W))
  })
  io.out_or_bitwise{0} := io.a{0} | io.b{0}
  io.out_or_bitwise{1} := io.a{1} | io.b{1}
  io.out_or_bitwise{2} := io.a{2} | io.b{2}
  io.out_or_logical := io.a | io.b
  io.out_not{0} := !io.out_not{0}
  io.out_not{1} := !io.out_not{1}
  io.out_not{2} := !io.out_not{2}
  io.out_not{3} := !io.out_not{3}
  io.out_not{4} := !io.out_not{4}
  io.out_not{5} := !io.out_not{5}
}
object Vectorgates extends App{
  (new ChiselStage).emitVerilog(new Vectorgates,Array("-td","vout"))
}
