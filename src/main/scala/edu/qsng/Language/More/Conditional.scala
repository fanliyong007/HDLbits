package edu.qsng.Language.More

import chisel3.util._
import chisel3._

class Conditional extends RawModule {
  val a = IO(Input(UInt(8.W)))
  val b = IO(Input(UInt(8.W)))
  val c = IO(Input(UInt(8.W)))
  val d = IO(Input(UInt(8.W)))
  val min = IO(Output(UInt(8.W)))

  val m1=Mux(a<b,a,b)
  val m2=Mux(c<d,c,d)
  min:=Mux(m1<m2,m1,m2)
}

