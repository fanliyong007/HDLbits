package edu.zucc.Language.Procedures

import chisel3._
import chisel3.stage.ChiselStage
import chisel3.util._

class Alwaysnolatches extends Module {

  val scancode = IO(Input(UInt(16.W)))
  val left = IO(Output(UInt(1.W)))
  val down = IO(Output(UInt(1.W)))
  val right = IO(Output(UInt(1.W)))
  val up = IO(Output(UInt(1.W)))

  val left_tmp=Reg(UInt(1.W))
  val down_tmp = Reg(UInt(1.W))
  val right_tmp = Reg(UInt(1.W))
  val up_tmp = Reg(UInt(1.W))
  left:=left_tmp
  down:=down_tmp
  right:=right_tmp
  up:=up_tmp
  left_tmp:="b0".U
  down_tmp:="b0".U
  right_tmp:="b0".U
  up_tmp:="b0".U
  switch(scancode){
    is("he06b".U) {left_tmp:="b1".U}
    is("he072".U) {down_tmp:="b1".U}
    is("he074".U) {right_tmp:="b1".U}
    is("he075".U) {up_tmp:="b1".U}
  }

}
object Alwaysnolatches extends App{
  (new ChiselStage).emitVerilog(new Alwaysnolatches,Array("-td","vout"))
}