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
    val shifted = Cat(regQ(510, 0), 0.U)
    regQ := ((regQ ^ shifted) & regQ(511, 1)) | ((regQ | shifted) & ( ~ regQ(511, 1)))
  }
  q:=regQ
}//(((q[511:0] ^ {q[510:0], 1'b0}) & q[511:1]) | ((q[511:0] | {q[510:0], 1'b0})
//{1'h0,(regQ[510:0] ^ {regQ[509:0], 1'h0}) & regQ[511:1] | (regQ[510:0] | {regQ[509:0], 1'h0})
//73c7461f09a33e269beef89be26f8e26e9be26f89bef8ee3877c0bc4df137c4d0000000000000000000000000000000000000000000000000000000000000000
//7 0111   5 0101  d  1101
//564dce311be7626fbe3b89be26f89a6fbbe26f89be389ba68dc41e4df137c4df0000000000000000000000000000000000000000000000000000000000000000
//d64dce311be7626fbe3b89be26f89a6fbbe26f89be389ba68dc41e4df137c4df0000000000000000000000000000000000000000000000000000000000000000
object Rule110 extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new Rule110,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}
