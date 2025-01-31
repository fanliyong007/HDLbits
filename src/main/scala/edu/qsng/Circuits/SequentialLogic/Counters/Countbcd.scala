package edu.qsng.Circuits.SequentialLogic.Counters
import chisel3._
import chisel3.util.Cat
import circt.stage.ChiselStage

class Countbcd extends Module with ImplicitClock {

  val clk = IO(Input(Clock()))
  val ena = IO(Output(UInt(4.W)))
  val q = IO(Output(UInt(16.W)))
  override protected def implicitClock = clk

  val qReg = Array.fill(4)(RegInit(0.U(4.W)))
  qReg(0) := qReg(0) + 1.U
  when(qReg(0) === 9.U){//chisel中没有阻塞与非阻塞赋值之分，:=仅代表硬件之间的链接
    qReg(0) := 0.U
    qReg(1) := qReg(1) + 1.U
  }
  when(qReg(1) === 9.U&&qReg(0) === 9.U){//注意90这种情况
    qReg(0) := 0.U
    qReg(1) := 0.U
    qReg(2) := qReg(2) + 1.U
  }
  when(qReg(2) === 9.U&&qReg(1) === 9.U&&qReg(0) === 9.U){
    qReg(0) := 0.U
    qReg(1) := 0.U
    qReg(2) := 0.U
    qReg(3) := qReg(3) + 1.U
  }
  when(qReg(3) === 9.U&&qReg(2) === 9.U&&qReg(1) === 9.U&&qReg(0) === 9.U){
    qReg(0) := 0.U
    qReg(1) := 0.U
    qReg(2) := 0.U
    qReg(3) := 0.U
  }
  ena := Cat(
    Mux(qReg(2) === 9.U&&qReg(1) === 9.U&&qReg(0) === 9.U,1.U,0.U),
    Mux(qReg(1) === 9.U&&qReg(0) === 9.U,1.U,0.U),//注意90这种情况
    Mux(qReg(0) === 9.U,1.U,0.U))
  q := Cat(qReg(3),qReg(2),qReg(1),qReg(0))
}

object Countbcd extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new Countbcd,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}
