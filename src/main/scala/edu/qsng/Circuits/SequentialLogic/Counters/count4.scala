package edu.qsng.Circuits.SequentialLogic.Counters
import chisel3._

class count4 extends BlackBox {
    val io=IO(new Bundle {
        val clk = Input(Clock())
        val enable = Input(Bool())
        val load = Input(Bool())
        val d = Input(UInt(4.W))
        val Q= Output(UInt(4.W))
      })

}
