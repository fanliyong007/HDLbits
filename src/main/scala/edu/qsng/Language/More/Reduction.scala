package edu.qsng.Language.More

import chisel3.util._
import chisel3._
class Reduction extends RawModule {
  val in = IO(Input(UInt(8.W)))
  val parity = IO(Output(UInt(1.W)))
  parity:=in.xorR
}
