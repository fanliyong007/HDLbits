package edu.qsng.Circuits.SequentialLogic.LatchesAndFlip_Flops

import chisel3._
import chisel3.stage.ChiselStage
//I can't do this,because chisel only support edge-triggered
class m2014_q4a  extends Module {
  val d = IO(Input(Bool()))  // 输入d
  val q = IO(Output(Bool()))  // 输出q

}


object m2014_q4a extends App {
  (new ChiselStage).emitVerilog(new m2014_q4a, Array("-td", "vout"))
}
