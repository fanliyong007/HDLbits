module Andgate(
  input   io_a,
  input   io_b,
  output  io_out
);
  assign io_out = io_a & io_b; // @[Andgate.scala 12:17]
endmodule
