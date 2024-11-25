package edu.qsng.Circuits.SequentialLogic.LatchesAndFlip_Flops

import chisel3._
import circt.stage.ChiselStage
import chisel3.util._


class Edgedetect extends Module with ImplicitClock {
  val clk = IO(Input(Clock()))
  val in = IO(Input(UInt(8.W)))
  val pedge = IO(Output(UInt(8.W)))

  override protected def implicitClock = clk

}

object Edgedetect extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new Edgedetect,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}
