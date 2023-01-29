package edu.zucc.Language.Procedures

import chisel3.stage.ChiselStage
import chisel3.util._
import chisel3._
import chisel3.stage.ChiselStage

class Alwaysif extends Module {
  val a=IO(Input(UInt(1.W)))
  val b=IO(Input(UInt(1.W)))
  val sel_b1=IO(Input(Bool()))
  val sel_b2=IO(Input(Bool()))
  val out_assign=IO(Output(UInt(1.W)))
  val out_always=IO(Output(UInt(1.W)))


  out_assign:=Mux(sel_b1,(Mux(sel_b2,b,a)),(Mux(sel_b2,a,a)))
  val tmp=Reg(UInt(1.W))
  out_always:=tmp
  when((!sel_b1)&&(!sel_b2)){
    tmp := a
  }.elsewhen((!sel_b1) && (sel_b2)) {
    tmp := a
  }.elsewhen((sel_b1) && (!sel_b2)) {
    tmp := a
  }.elsewhen((sel_b1) && (sel_b2)) {
    tmp := b
  }



}
object Alwaysif extends App{
  (new ChiselStage).emitVerilog(new Alwaysif,Array("-td","vout"))
}