module Zero(
  input   clock,
  input   reset,
  output  io_zero
);
  assign io_zero = 1'h0; // @[Zero.scala 10:11]
endmodule
