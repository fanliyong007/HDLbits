module Wiredecl(
  input   io_a,
  input   io_b,
  input   io_c,
  input   io_d,
  output  io_out,
  output  io_out_d
);
  wire  tmp_wire = io_a & io_b | io_c & io_d; // @[Wiredecl.scala 16:26]
  assign io_out = io_a & io_b | io_c & io_d; // @[Wiredecl.scala 16:26]
  assign io_out_d = ~tmp_wire; // @[Wiredecl.scala 18:15]
endmodule
