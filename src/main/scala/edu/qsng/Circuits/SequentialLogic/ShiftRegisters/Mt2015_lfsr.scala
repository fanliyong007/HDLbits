package edu.qsng.Circuits.SequentialLogic.ShiftRegisters
import chisel3._
import chisel3.util.Cat
import circt.stage.ChiselStage

class Mt2015_lfsr extends Module with ImplicitClock {

  val SW = IO(Input(UInt(3.W)))
  val KEY = IO(Input(UInt(2.W)))
  val LEDR = IO(Output(UInt(3.W)))
  override protected def implicitClock = clk
  val clk=Wire(Clock())
  val L  =Wire(UInt(1.W))
  val R  =Wire(UInt(3.W))
  val Q  =Reg(UInt(3.W))
  clk := KEY(0).asClock;
  L   := KEY(1);
  R   := SW;

  Q := Cat(
    Mux(L.asBool, R(2) ,(Q(1) ^ Q(2))),
    Mux(L.asBool,R(1) , Q(0)),
    Mux(L.asBool,R(0) , Q(2)))

  LEDR := Q

}
object Mt2015_lfsr extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new Mt2015_lfsr,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}