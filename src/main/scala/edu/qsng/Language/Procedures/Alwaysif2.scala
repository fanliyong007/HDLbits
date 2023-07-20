package edu.qsng.Language.Procedures

import chisel3.stage.ChiselStage
import chisel3.util._
import chisel3._
import chisel3.stage.ChiselStage

class Alwaysif2 extends Module {
  val cpu_overheated=IO(Input(Bool()))
  val shut_off_computer=IO(Output(UInt(1.W)))
  val arrived=IO(Input(Bool()))
  val gas_tank_empty=IO(Input(UInt(1.W)))
  val keep_driving=IO(Output(UInt(1.W)))

  val t_shut_off_computer=Reg(UInt(1.W))
  val t_keep_driving=Reg(UInt(1.W))

  shut_off_computer:=t_shut_off_computer
  keep_driving:=t_keep_driving
  when(cpu_overheated){
    t_shut_off_computer:=1.U
  }.otherwise{
    t_shut_off_computer:=0.U
  }
  when((!arrived)&&(!gas_tank_empty)) {
    t_keep_driving := 1.U
  }.otherwise {
    t_keep_driving := 0.U
  }
}
object Alwaysif2 extends App{
  (new ChiselStage).emitVerilog(new Alwaysif2,Array("-td","vout"))
}