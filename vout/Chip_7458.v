module Chip_7458(
  input   io_p1a,
  input   io_p1b,
  input   io_p1c,
  input   io_p1d,
  input   io_p1e,
  input   io_p1f,
  output  io_p1y,
  input   io_p2a,
  input   io_p2b,
  input   io_p2c,
  input   io_p2d,
  output  io_p2y
);
  assign io_p1y = io_p1a & io_p1b & io_p1c | io_p1d & io_p1e & io_p1f; // @[Chip_7458.scala 22:35]
  assign io_p2y = io_p2a & io_p2b | io_p2c & io_p2d; // @[Chip_7458.scala 23:28]
endmodule
