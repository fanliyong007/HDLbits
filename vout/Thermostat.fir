FIRRTL version 1.1.0
circuit Thermostat :
  module Thermostat :
    input too_cold : UInt<1>
    input too_hot : UInt<1>
    input mode : UInt<1>
    input fan_on : UInt<1>
    output heater : UInt<1>
    output aircon : UInt<1>
    output fan : UInt<1>

    node _heater_T = and(mode, too_cold) @[Thermostat.scala 14:18]
    heater <= _heater_T @[Thermostat.scala 14:10]
    node _aircon_T = not(mode) @[Thermostat.scala 15:14]
    node _aircon_T_1 = and(_aircon_T, too_hot) @[Thermostat.scala 15:21]
    aircon <= _aircon_T_1 @[Thermostat.scala 15:10]
    node _fan_T = or(heater, aircon) @[Thermostat.scala 16:19]
    node _fan_T_1 = or(_fan_T, fan_on) @[Thermostat.scala 16:29]
    fan <= _fan_T_1 @[Thermostat.scala 16:7]

