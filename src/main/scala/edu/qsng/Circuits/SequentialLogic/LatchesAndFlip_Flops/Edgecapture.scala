package edu.qsng.Circuits.SequentialLogic.LatchesAndFlip_Flops
import chisel3._
import circt.stage.ChiselStage
import chisel3.util._

class Edgecapture extends Module{
  val clk = IO(Input(Clock()))
  val in = IO(Input(UInt(32.W)))
  val out = IO(Output(UInt(32.W)))
  withClockAndReset(clk,reset){
    val myReg = Reg(UInt(32.W))
    val outReg = RegInit(0.U(32.W))
    myReg := in
    outReg := outReg | myReg & ~(in)
    out := outReg
  }

}

object Edgecapture extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new Edgecapture,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}