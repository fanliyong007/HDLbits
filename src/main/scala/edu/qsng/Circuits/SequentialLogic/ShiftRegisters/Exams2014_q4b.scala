package edu.qsng.Circuits.SequentialLogic.ShiftRegisters

import chisel3._
import chisel3.util.Cat
import circt.stage.ChiselStage
import scribe.output.Color.Red


class MUXDFF extends Module with ImplicitClock{
  val R = IO(Input(Bool()))
  val clk = IO(Input(Clock()))
  val E = IO(Input(Bool()))
  val L = IO(Input(Bool()))
  val w = IO(Input(Bool()))
  val out = IO(Output(Bool()))
  override protected def implicitClock = clk
  val mid0 = Wire(Bool())
  val mid1 = Wire(Bool())
  mid0 := Mux(E, w, out)
  mid1 := Mux(L, R, mid0)
  val regOut = RegNext(mid1)
  out := regOut
}

class Exams2014_q4b extends Module {
  val SW = IO(Input(UInt(4.W)))
  val KEY = IO(Input(UInt(4.W)))
  val LEDR = IO(Output(UInt(4.W)))
  val ins0 = Module(new MUXDFF)
  ins0.R := SW(3)
  ins0.clk := KEY(0).asClock
  ins0.E := KEY(1)
  ins0.L := KEY(2)
  ins0.w := KEY(3)
  val ins1 = Module(new MUXDFF)
  ins1.R := SW(2)
  ins1.clk := KEY(0).asClock
  ins1.E := KEY(1)
  ins1.L := KEY(2)
  ins1.w := LEDR(3)
  val ins2 = Module(new MUXDFF)
  ins2.R := SW(1)
  ins2.clk := KEY(0).asClock
  ins2.E := KEY(1)
  ins2.L := KEY(2)
  ins2.w := LEDR(2)
  val ins3 = Module(new MUXDFF)
  ins3.R := SW(0)
  ins3.clk := KEY(0).asClock
  ins3.E := KEY(1)
  ins3.L := KEY(2)
  ins3.w := LEDR(1)
  LEDR:=Cat(ins0.out,ins1.out,ins2.out,ins3.out)
}

object Exams2014_q4b extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new Exams2014_q4b,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}