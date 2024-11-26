package edu.qsng.Circuits.SequentialLogic.LatchesAndFlip_Flops
import chisel3._
import circt.stage.ChiselStage

class Dualedge extends Module{
  val clk = IO(Input(Clock()))
  val d = IO(Input(Bool()))
  val q = IO(Output(Bool()))
  val pos,neg = Wire(Bool())
  withClock(clk){
    val posReg = Reg(UInt(1.W))
    posReg := d
    pos:=posReg
  }
  withClock((~(clk.asBool)).asClock){
    val negReg = Reg(UInt(1.W))
    negReg := d
    neg:=negReg
  }
  q := Mux(clk.asBool,pos,neg)

}
object Dualedge extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new Dualedge,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}
