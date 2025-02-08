package edu.qsng.Circuits.SequentialLogic.MoreCircuits
import chisel3._
import chisel3.util.Cat
import circt.stage.ChiselStage

class Rule110 extends Module with ImplicitClock {

  val clk = IO(Input(Clock()))
  val load = IO(Input(Bool()))
  val data= IO(Input(UInt(512.W)))
  val q = IO(Output(UInt(512.W)))
  override protected def implicitClock = clk
  val regQ = Reg(UInt(512.W))
  when(load){
    regQ:=data
  }.otherwise {
    val L = Cat(0.U,regQ(511,1))
    val R = Cat(regQ(510,0),0.U)
    regQ := ((~L) & (regQ | R))|(L & (~regQ) & R) | (L & regQ & (~R))
  }
  q:=regQ
}
object Rule110 extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new Rule110,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}
