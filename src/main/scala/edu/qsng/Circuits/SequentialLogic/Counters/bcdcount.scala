package edu.qsng.Circuits.SequentialLogic.Counters
import chisel3._

class bcdcount extends BlackBox {
  val io = IO(new Bundle{
    val clk =Input(Clock())
    val reset = Input(Bool())
    val enable = Input(Bool())
    val Q= Output(UInt(4.W))
  })

}
