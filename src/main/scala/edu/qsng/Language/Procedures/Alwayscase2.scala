package edu.qsng.Language.Procedures

import chisel3.stage.ChiselStage
import chisel3.util.{is, _}
import chisel3._
class Alwayscase2  extends Module {
  val in=IO(Input(UInt(4.W)))
  val pos=IO(Output(UInt(2.W)))

  val pos_reg=Reg(UInt(2.W))
  pos:=pos_reg
  pos_reg:=PriorityEncoder(in)
  //PriorityEncoder 有大问题会生成错误default情况
//  switch(in){
//    is("b???1".U) {tmp_pos := "b00".U}
//    is ("b??10".U) {tmp_pos := "b01".U}
//    is ("b?100".U) {tmp_pos := "b10".U}
//    is ("b1000".U) {tmp_pos := "b11".U}
//  }
}
object Alwayscase2 extends App{
  (new ChiselStage).emitVerilog(new Alwayscase2,Array("-td","vout"))
}