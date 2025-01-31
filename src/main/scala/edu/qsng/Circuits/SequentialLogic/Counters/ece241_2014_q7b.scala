package edu.qsng.Circuits.SequentialLogic.Counters
import chisel3._
import chisel3.util.Cat
import circt.stage.ChiselStage

class ece241_2014_q7b extends Module with ImplicitClock {

  val clk = IO(Input(Clock()))
  val OneHertz = IO(Output(Bool()))
  val c_enable = IO(Output(UInt(3.W)))
  override protected def implicitClock = clk
  val counter = Array.fill(3)(Module(new bcdcount()))
  val q = Array.fill(3)(Wire(UInt(4.W)))

  counter(0).io.clk := clk
  counter(0).io.reset := reset
  counter(0).io.enable := c_enable(0)
  q(0) := counter(0).io.Q

  counter(1).io.clk := clk
  counter(1).io.reset := reset
  counter(1).io.enable := c_enable(1)
  q(1) := counter(1).io.Q

  counter(2).io.clk := clk
  counter(2).io.reset := reset
  counter(2).io.enable := c_enable(2)
  q(2) := counter(2).io.Q

  c_enable := Cat((q(1)===9.U)&&(q(0)===9.U),q(0)===9.U, 1.U)//注意使用===而非==,在chisel中只有==
  OneHertz := (q(2)===9.U)&&(q(1)===9.U)&&(q(0)===9.U)
}

object ece241_2014_q7b extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new ece241_2014_q7b,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}