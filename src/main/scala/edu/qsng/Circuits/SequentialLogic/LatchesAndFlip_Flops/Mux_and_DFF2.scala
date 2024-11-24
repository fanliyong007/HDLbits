package edu.qsng.Circuits.SequentialLogic.LatchesAndFlip_Flops

import chisel3._
import circt.stage.ChiselStage

class Mux_and_DFF2 extends Module with ImplicitClock {
  val clk = IO(Input(Clock()))
  val w,R,E,L = IO(Input(Bool()))
  val Q = IO(Output(Bool()))
  override protected def implicitClock = clk
  val QReg = Reg(Bool())
  when(L){
    QReg := R
  }.otherwise{
    when(E){QReg := w}.otherwise{QReg := Q}
  }
  Q := QReg
}

object Mux_and_DFF2 extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new Mux_and_DFF2,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}
