module Gatesv100(
  input  [99:0] in,
  output [98:0] out_both,
  output [98:0] out_any,
  output [99:0] out_different
);
  wire [99:0] _out_different_T_3 = {in[0],in[99:1]}; // @[Cat.scala 33:92]
  assign out_both = in[98:0] & in[99:1]; // @[Gatesv100.scala 12:29]
  assign out_any = in[99:1] | in[98:0]; // @[Gatesv100.scala 13:28]
  assign out_different = in ^ _out_different_T_3; // @[Gatesv100.scala 14:29]
endmodule
