package edu.qsng.Circuits.SequentialLogic.LatchesAndFlip_Flops

import chisel3._
import chisel3.util.Cat

class Dff16e extends RawModule {
  val clk = IO(Input(Clock()))
  val resetn = IO(Input(Bool()))
  val byteena = IO(Input(UInt(2.W)))
  val d = IO(Input(UInt(16.W)))
  val q = IO(Output(UInt(16.W)))
  //(~clk.asUInt).asBool.asClock can  be triggered by the negative edge of clk.
  withClockAndReset(clk,(~resetn).asBool) {
    val myReg = RegInit(UInt(16.W),0.U)
    q := myReg
    when(byteena === "b00".U){
      myReg := q
    }.elsewhen(byteena === "b01".U){
      myReg := Cat(q(15,8), d(7,0))
    }.elsewhen(byteena === "b10".U){
      myReg := Cat(d(15,8), q(7,0))
    }.otherwise {
      myReg := d
    }
  }
}
