package edu.qsng.Circuits.SequentialLogic.LatchesAndFlip_Flops
import chisel3._
import circt.stage.ChiselStage

class Edgedetect2 extends Module with ImplicitClock {
  val clk = IO(Input(Clock()))
  val in = IO(Input(UInt(8.W)))
  val anyedge = IO(Output(UInt(8.W)))

  override protected def implicitClock = clk
  val tempReg = Reg(UInt(8.W))
  val anyedgeReg = Reg(UInt(8.W))
  tempReg := in
  anyedgeReg := tempReg ^ in
  anyedge := anyedgeReg

}

object Edgedetect2 extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new Edgedetect2,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}