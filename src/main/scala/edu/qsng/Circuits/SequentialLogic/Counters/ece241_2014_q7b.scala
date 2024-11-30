package edu.qsng.Circuits.SequentialLogic.Counters
import chisel3._
import chisel3.util.Cat
import circt.stage.ChiselStage

class ece241_2014_q7b extends Module with ImplicitClock {

  val clk = IO(Input(Clock()))
  val OneHertz = IO(Output(Bool()))
  val c_enable = IO(Output(UInt(3.W)))
  override protected def implicitClock = clk
  val Q = Wire(UInt(12.W))
  val bc = Array.fill(3)(Module(new bcdcount()))
  bc(0).io.clk := clk
  bc(0).io.reset := reset
  bc(0).io.enable := c_enable(0)
  bc(1).io.clk := clk
  bc(1).io.reset := reset
  bc(1).io.enable := c_enable(1)
  bc(2).io.clk := clk
  bc(2).io.reset := reset
  bc(2).io.enable := c_enable(2)
  Q := Cat(bc(0).io.Q,bc(1).io.Q,bc(2).io.Q)
  c_enable := Cat(1.U,Q(3,0)===9.U,Q(7,0)===153.U)
  OneHertz := Q(11,0)===2457.U

}

object ece241_2014_q7b extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new ece241_2014_q7b,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}