package edu.zucc.Language.Module

import chisel3.stage.ChiselStage
import chisel3.util.{Cat, Fill}
import chisel3._

class add16 extends BlackBox{
  val io = IO(new Bundle{
    val a = Input(UInt(16.W))
    val b = Input(UInt(16.W))
    val cin = Input(UInt(1.W))
    val sum = Output(UInt(16.W))
    val cout = Output(Bool())
  })
}
class Addsub extends Module {
  val io=IO(new Bundle{
    val a=Input(UInt(32.W))
    val b=Input(UInt(32.W))
    val sub=Input(UInt(1.W))
    val sum=Output(UInt(32.W))
  })

  val cout=Wire(Bool())
  val sum1=Wire(UInt(16.W))
  val sum2=Wire(UInt(16.W))
  val Sub=Wire(UInt(32.W))
  Sub:=Fill(32,io.sub)
  val B=Wire(UInt(32.W))
  B:=Sub ^ io.b

  val u1_add16=Module(new add16())
  u1_add16.io.a:=io.a(15,0)
  u1_add16.io.b:=B(15,0)
  u1_add16.io.cin:=io.sub
  sum1:=u1_add16.io.sum
  cout:=u1_add16.io.cout

  val u2_add16=Module(new add16())
  u2_add16.io.a := io.a(31, 16)
  u2_add16.io.b := B(31, 16)
  u2_add16.io.cin:=cout
  sum2 := u2_add16.io.sum

  io.sum:=Cat(sum2,sum1)
}

object Addsub extends App{
  (new ChiselStage).emitVerilog(new Addsub,Array("-td","vout"))
}