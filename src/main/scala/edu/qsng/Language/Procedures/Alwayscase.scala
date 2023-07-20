package edu.qsng.Language.Procedures
import chisel3.stage.ChiselStage
import chisel3.util.{is, _}
import chisel3._
import chisel3.stage.ChiselStage
class Alwayscase extends Module {
  val sel=IO(Input(UInt(3.W)))
  val data0=IO(Input(UInt(4.W)))
  val data1=IO(Input(UInt(4.W)))
  val data2=IO(Input(UInt(4.W)))
  val data3=IO(Input(UInt(4.W)))
  val data4=IO(Input(UInt(4.W)))
  val data5=IO(Input(UInt(4.W)))
  val out=IO(Output(UInt(4.W)))

  val tmp_out=Reg(UInt(4.W))
  out:=tmp_out
  switch(sel){
    is("b000".U) {tmp_out := data0}
    is ("b001".U) {tmp_out := data1}
    is ("b010".U) {tmp_out := data2}
    is ("b011".U) {tmp_out := data3}
    is ("b100".U) {tmp_out := data4}
    is ("b101".U) {tmp_out := data5}
    is("b110".U) {tmp_out := 0.U}
    is("b111".U) {tmp_out := 0.U}
  }
}
object Alwayscase extends App{
  (new ChiselStage).emitVerilog(new Alwayscase,Array("-td","vout"))
}