// See README.md for license details.

package edu.zucc

import chisel3._
import chisel3.stage.{ChiselStage, ChiselGeneratorAnnotation}

/**
  * Compute GCD using subtraction method.
  * Subtracts the smaller from the larger until register y is zero.
  * value in register x is then the GCD
  */
class GCD extends Module {
  val io = IO(new Bundle {
    val value1        = Input(UInt(16.W))
    val value2        = Input(UInt(16.W))
    val loadingValues = Input(Bool())
    val outputGCD     = Output(UInt(16.W))
    val outputValid   = Output(Bool())
  })

  val x  = RegInit(0.U(16.W))
  val y  = RegInit(0.U(16.W))

  when(x > y) { x := x - y }
    .otherwise { y := y - x }

  when(io.loadingValues) {
    x := io.value1
    y := io.value2
  }

  io.outputGCD := x
  io.outputValid := y === 0.U
}

object GCD extends App {
  // emitVerilog
  (new ChiselStage).emitVerilog(new GCD,Array("-td","vout"))

  // generate graph files for circuit visualization
  (new layered.stage.ElkStage).execute(
    Array("-td", "vout", "--lowFir"),
    Seq(ChiselGeneratorAnnotation(() => new GCD))
  )
}
