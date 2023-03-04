module Conditional(
  input  [7:0] a,
  input  [7:0] b,
  input  [7:0] c,
  input  [7:0] d,
  output [7:0] min
);
  wire [7:0] m1 = a < b ? a : b; // @[Conditional.scala 14:13]
  wire [7:0] m2 = c < d ? c : d; // @[Conditional.scala 15:13]
  assign min = m1 < m2 ? m1 : m2; // @[Conditional.scala 16:11]
endmodule
