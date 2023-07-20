module Mux2to1v(
  input  [99:0] a,
  input  [99:0] b,
  input         sel,
  output [99:0] out
);
  assign out = sel ? b : a; // @[Mux2to1v.scala 11:13]
endmodule
