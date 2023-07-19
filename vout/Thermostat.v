module Thermostat(
  input   too_cold,
  input   too_hot,
  input   mode,
  input   fan_on,
  output  heater,
  output  aircon,
  output  fan
);
  assign heater = mode & too_cold; // @[Thermostat.scala 14:18]
  assign aircon = ~mode & too_hot; // @[Thermostat.scala 15:21]
  assign fan = heater | aircon | fan_on; // @[Thermostat.scala 16:29]
endmodule
