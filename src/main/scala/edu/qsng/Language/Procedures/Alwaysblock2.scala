package edu.qsng.Language.Procedures

import chisel3.util._
import chisel3._

class Alwaysblock2 extends Module {
  val a = IO(Input(UInt(1.W)))
  val b = IO(Input(UInt(1.W)))
  val out_assign = IO(Output(UInt(1.W)))
  val out_always_comb = IO(Output(UInt(1.W)))
  val out_always_ff = IO(Output(UInt(1.W)))

  val tmp=Reg(UInt(1.W))
  out_assign:= a ^ b
  tmp := a ^ b
  out_always_comb:=tmp
  out_always_ff:=tmp
}