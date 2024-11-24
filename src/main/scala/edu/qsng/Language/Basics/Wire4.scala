package edu.qsng.Language.Basics

import chisel3._
//题目大意为将输出端口与输入端口对应的连接起来
class Wire4 extends RawModule {
  val io = IO(new Bundle {
    val a=Input(UInt(1.W))
    val b=Input(UInt(1.W))
    val c=Input(UInt(1.W))
    val w=Output(UInt(1.W))
    val x=Output(UInt(1.W))
    val y=Output(UInt(1.W))
    val z=Output(UInt(1.W))
  })
  io.w:=io.a
  io.x:=io.b
  io.y:=io.b
  io.z:=io.c
}
