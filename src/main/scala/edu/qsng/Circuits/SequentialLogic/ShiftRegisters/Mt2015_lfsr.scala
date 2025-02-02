package edu.qsng.Circuits.SequentialLogic.ShiftRegisters
import chisel3._
import chisel3.util.Cat
import circt.stage.ChiselStage

class Mt2015_lfsr extends Module with ImplicitClock {

  val SW = IO(Input(UInt(3.W)))
  val KEY = IO(Input(UInt(2.W)))
  val LEDR = IO(Output(UInt(3.W)))


}
object Mt2015_lfsr extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new Mt2015_lfsr,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}