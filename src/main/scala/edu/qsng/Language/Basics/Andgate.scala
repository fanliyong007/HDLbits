package edu.qsng.Language.Basics

import chisel3._

class Andgate extends RawModule {
    val a=IO(Input(UInt(1.W)))
    val b=IO(Input(UInt(1.W)))
    val out=IO(Output(UInt(1.W)))

  out := a&b
}
