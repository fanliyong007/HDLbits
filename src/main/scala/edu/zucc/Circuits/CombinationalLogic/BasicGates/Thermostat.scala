package edu.zucc.Circuits.CombinationalLogic.BasicGates

import chisel3._
import chisel3.stage.ChiselStage

class Thermostat extends RawModule {
  val too_cold = IO(Input(Bool()))
  val too_hot = IO(Input(Bool()))
  val mode = IO(Input(Bool()))
  val fan_on = IO(Input(Bool()))
  val heater = IO(Output(Bool()))
  val aircon = IO(Output(Bool()))
  val fan = IO(Output(Bool()))
  heater := mode & too_cold
  aircon := (~mode) & too_hot
  fan :=  (heater | aircon) | fan_on
}

object Thermostat extends App {
  (new ChiselStage).emitVerilog(new Thermostat, Array("-td", "vout"))
}
