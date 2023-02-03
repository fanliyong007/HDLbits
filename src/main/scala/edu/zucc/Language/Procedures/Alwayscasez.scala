package edu.zucc.Language.Procedures

import chisel3._
import chisel3.stage.ChiselStage
import chisel3.util._

class Alwayscasez extends Module {
  val in = IO(Input(UInt(8.W)))
  val pos = IO(Output(UInt(3.W)))

  val pos_reg = Reg(UInt(3.W))

  pos := pos_reg
  pos_reg := PriorityEncoder(in)
}
object Alwayscasez extends App{
  (new ChiselStage).emitVerilog(new Alwayscasez,Array("-td","vout"))
}