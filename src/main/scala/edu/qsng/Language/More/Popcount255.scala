package edu.qsng.Language.More

import chisel3.util._
import chisel3._
class Popcount255 extends RawModule {
  val in = IO(Input(UInt(255.W)))
  val out = IO(Output(UInt(8.W)))
  out:=PopCount(in)
}