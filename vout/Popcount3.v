module Popcount3(
  input  [2:0] in,
  output [1:0] out
);
  wire [1:0] _out_T_3 = in[1] + in[2]; // @[Bitwise.scala 51:90]
  wire [1:0] _GEN_0 = {{1'd0}, in[0]}; // @[Bitwise.scala 51:90]
  wire [2:0] _out_T_5 = _GEN_0 + _out_T_3; // @[Bitwise.scala 51:90]
  assign out = _out_T_5[1:0]; // @[Bitwise.scala 51:90]
endmodule
