module Vector1(
  input  [15:0] io_in,
  output [7:0]  io_out_hi,
  output [7:0]  io_out_lo
);
  assign io_out_hi = io_in[15:8]; // @[Vector1.scala 12:21]
  assign io_out_lo = io_in[7:0]; // @[Vector1.scala 13:21]
endmodule
