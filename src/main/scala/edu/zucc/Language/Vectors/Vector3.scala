package edu.zucc.Language.Vectors

import chisel3._
import chisel3.stage.ChiselStage
import chisel3.util._

class Vector3 extends RawModule {//待优化
  val io=IO(new Bundle() {
    val a,b,c,d,e,f = Input(UInt(5.W))
    val w,x,y,z = Output(UInt(8.W))
  })
  val before=Cat(io.a,io.b,io.c,io.d,io.e,io.f,"b11".U)
  io.w:=before(31,24)
  io.x:=before(23,16)
  io.y:=before(15,8)
  io.z:=before(7,0)
}
object Vector3 extends App{
  (new ChiselStage).emitVerilog(new Vector3,Array("-td","vout"))
}