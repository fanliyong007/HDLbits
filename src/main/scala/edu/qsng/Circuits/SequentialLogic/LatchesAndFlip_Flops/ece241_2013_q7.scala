package edu.qsng.Circuits.SequentialLogic.LatchesAndFlip_Flops

import chisel3._
import chisel3.util.{Cat, is, switch}
import circt.stage.ChiselStage

class ece241_2013_q7 extends Module with ImplicitClock {
  val clk = IO(Input(Clock()))
  val j,k = IO(Input(Bool()))
  val Q = IO(Output(Bool()))

  override protected def implicitClock = clk
  val QReg = Reg(UInt(1.W))
  switch(Cat(j,k)){
    is(0.U){QReg:=Q}
    is(1.U){QReg:=false.B}
    is(2.U){QReg:=true.B}
    is(3.U){QReg:= ~Q}
  }
  Q := QReg
}

object ece241_2013_q7 extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new ece241_2013_q7,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}
