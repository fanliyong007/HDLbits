package edu.zucc.Language.Module

import chisel3._
import chisel3.stage.ChiselStage
import chisel3.util._
import chisel3.experimental._ // To enable experimental features


//class add16 extends BlackBox{
//  val io = IO(new Bundle{
//    val a = Input(UInt(16.W))
//    val b = Input(UInt(16.W))
//    val cin = Input(UInt(1.W))
//    val sum = Output(UInt(16.W))
//    val cout = Output(Bool())
//  })
//}
class Cseladd extends Module {
  val io=IO(new Bundle{
    val a=Input(UInt(32.W))
    val b=Input(UInt(32.W))
    val sum=Output(UInt(32.W))
  })

  val cout=Wire(Bool())
  val sum1=Wire(UInt(16.W))
  val sum2=Wire(UInt(16.W))
  val sum3=Wire(UInt(16.W))

  val u1_add16=Module(new add16())
  u1_add16.io.a:=io.a(15,0)
  u1_add16.io.b:=io.b(15,0)
  u1_add16.io.cin:=0.U
  sum1:=u1_add16.io.sum
  cout:=u1_add16.io.cout

  val u2_add16=Module(new add16())
  u2_add16.io.a := io.a(31, 16)
  u2_add16.io.b := io.b(31, 16)
  u2_add16.io.cin:=0.U
  sum2 := u2_add16.io.sum

  val u3_add16=Module(new add16())
  u3_add16.io.a := io.a(31, 16)
  u3_add16.io.b := io.b(31, 16)
  u3_add16.io.cin := 1.U
  sum3 := u3_add16.io.sum

  when(!cout){
    io.sum:=Cat(sum2,sum1)
  }.otherwise {
    io.sum:=Cat(sum3,sum1)
  }
}

object Cseladd extends App{
  (new ChiselStage).emitVerilog(new Cseladd,Array("-td","vout"))
}