module Ringer(
  input   ring,
  input   vibrate_mode,
  output  ringer,
  output  motor
);
  assign ringer = ring & ~vibrate_mode; // @[Ringer.scala 12:18]
  assign motor = ring & vibrate_mode; // @[Ringer.scala 11:17]
endmodule
