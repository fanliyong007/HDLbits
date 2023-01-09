module Vectorgates(
  input  [2:0] a,
  input  [2:0] b,
  output [2:0] out_or_bitwise,
  output       out_or_logical,
  output [5:0] out_not
);
  wire [2:0] out_not_T = ~b; // @[Vectorgates.scala 16:21]
  wire [2:0] out_not_T_1 = ~a; // @[Vectorgates.scala 16:27]
  assign out_or_bitwise = a | b; // @[Vectorgates.scala 14:29]
  assign out_or_logical = ~(a == 3'h0 & b == 3'h0); // @[Vectorgates.scala 15:24]
  assign out_not = {out_not_T,out_not_T_1}; // @[Cat.scala 33:92]
endmodule
