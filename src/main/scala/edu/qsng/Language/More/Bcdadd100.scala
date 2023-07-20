package edu.qsng.Language.More
import chisel3.stage.ChiselStage
import chisel3.util._
import chisel3._

class Bcdadd100 extends Module {
  val io = IO(new Bundle {
    val a = Input(UInt(400.W))
    val b = Input(UInt(400.W))
    val cin = Input(Bool())
    val cout = Output(Bool())
    val sum = Output(UInt(400.W))
  })

  val u_bcd_fadd = Array.fill(100)(Module(new bcd_fadd()).io)
  val bcd_sum = Wire(Vec(100, UInt(4.W)))
  val bcd_carry = Wire(Vec(101, Bool()))

  bcd_carry(0):=io.cin
  for(i <- 0 until 100){
    u_bcd_fadd(i).a := Cat(io.a(i * 4 + 3), io.a(i * 4 + 2), io.a(i * 4 + 1), io.a(i * 4))
    u_bcd_fadd(i).b := Cat(io.b(i * 4 + 3), io.b(i * 4 + 2), io.b(i * 4 + 1), io.b(i * 4))
    u_bcd_fadd(i).cin:=bcd_carry(i)
    bcd_carry(i+1):=u_bcd_fadd(i).cout
    bcd_sum(i):=u_bcd_fadd(i).sum
  }
  io.cout:=bcd_carry(100)
  io.sum:=bcd_sum.asUInt
}

object Bcdadd100 extends App{
  (new ChiselStage).emitVerilog(new Bcdadd100,Array("-td","vout"))
}