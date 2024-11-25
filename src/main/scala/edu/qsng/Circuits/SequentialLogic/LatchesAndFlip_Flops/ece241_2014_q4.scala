package edu.qsng.Circuits.SequentialLogic.LatchesAndFlip_Flops

import chisel3._
import circt.stage.ChiselStage

class ece241_2014_q4 extends Module with ImplicitClock {
  val clk = IO(Input(Clock()))
  val x = IO(Input(Bool()))
  val z = IO(Output(Bool()))

  override protected def implicitClock = clk

  val myReg = Array.fill(3)(Reg(UInt(1.W)))
  myReg(0) := (x ^  myReg(0) )
  myReg(1) := (x | (~myReg(1)))
  myReg(2) := (x & (~myReg(2)))
  z := ~(myReg(0) | myReg(1) | myReg(2))
}

object ece241_2014_q4 extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new ece241_2014_q4,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}
