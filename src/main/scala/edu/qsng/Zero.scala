package edu.qsng

import chisel3._
import circt.stage.ChiselStage

class Zero extends RawModule {
  val io = IO(new Bundle {
    val clk = Input(Clock())
    val in  = Input(UInt(8.W))
    val out = Output(UInt(8.W))
  })

  val reg = RegInit(0.U(8.W))
  reg := io.in // 这将在下一个时钟周期更新reg的值（由Chisel隐式管理）
  io.out := reg
}

//object Zero extends App{
//  ChiselStage.emitSystemVerilogFile(
//    new Zero,
//    firtoolOpts = Array(
//      "-disable-all-randomization",
//      "-strip-debug-info")
//  )
//}
