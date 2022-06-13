package edu.zucc

import chisel3._
import chisel3.stage.{ChiselGeneratorAnnotation, ChiselStage}

class StepOne extends Module {
  val io = IO(new Bundle {
    val one = Output(UInt(1.W))
  })
  io.one := 1.U
}

object StepOne extends App {
  // emitVerilog
  (new ChiselStage).emitVerilog(new StepOne,Array("-td","vout"))

  // generate graph files for circuit visualization
  (new layered.stage.ElkStage).execute(
    Array("-td", "vout", "--lowFir"),
    Seq(ChiselGeneratorAnnotation(() => new StepOne))
  )
}
