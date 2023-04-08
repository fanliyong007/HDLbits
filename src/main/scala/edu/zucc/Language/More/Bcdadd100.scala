package edu.zucc.Language.More
import chisel3.stage.ChiselStage
import chisel3.util._
import chisel3._
import chisel3.internal.firrtl.Width
class Bcdadd100 extends Module {
  val a = IO(Input(UInt(399.W)))
  val b = IO(Input(UInt(399.W)))
  val cin = IO(Input(UInt(1.W)))
  val cout = IO(Output(UInt(1.W)))
  val sum = IO(Output(UInt(399.W)))


}


object Bcdadd100 extends App{
  (new ChiselStage).emitVerilog(new Bcdadd100,Array("-td","vout"))
}