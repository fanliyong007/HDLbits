package edu.qsng.Language.Vectors

import chisel3._
import chisel3.stage.ChiselStage
import chisel3.util._
class Vectorgates extends RawModule {
  val io=IO(new Bundle() {
    val a=Input(UInt(3.W))
    val b=Input(UInt(3.W))
    val out_or_bitwise=Output(UInt(3.W))
    val out_or_logical=Output(Bool())
    val out_not=Output(UInt(6.W))
  })
  io.out_or_bitwise := io.a | io.b
  io.out_or_logical := !(!io.a && !io.b)
  //强制转换为Bool型后才能类型匹配使用||
  io.out_not := Cat(~io.b,~io.a)

}
object Vectorgates extends App{
  (new ChiselStage).emitVerilog(new Vectorgates,Array("-td","vout"))
}
