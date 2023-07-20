module Gatesv(
  input  [3:0] in,
  output [2:0] out_both,
  output [2:0] out_any,
  output [3:0] out_different
);
  wire  _out_both_T_2 = in[3] & in[2]; // @[Gatesv.scala 13:24]
  wire  _out_both_T_5 = in[2] & in[1]; // @[Gatesv.scala 13:36]
  wire  _out_both_T_8 = in[1] & in[0]; // @[Gatesv.scala 13:48]
  wire [1:0] out_both_hi = {_out_both_T_2,_out_both_T_5}; // @[Cat.scala 33:92]
  wire  _out_any_T_2 = in[3] | in[2]; // @[Gatesv.scala 14:23]
  wire  _out_any_T_5 = in[2] | in[1]; // @[Gatesv.scala 14:35]
  wire  _out_any_T_8 = in[1] | in[0]; // @[Gatesv.scala 14:47]
  wire [1:0] out_any_hi = {_out_any_T_2,_out_any_T_5}; // @[Cat.scala 33:92]
  wire  _out_different_T_3 = in[0] == in[3] ? 1'h0 : 1'h1; // @[Gatesv.scala 16:8]
  wire  _out_different_T_7 = in[3] == in[2] ? 1'h0 : 1'h1; // @[Gatesv.scala 17:8]
  wire  _out_different_T_11 = in[2] == in[1] ? 1'h0 : 1'h1; // @[Gatesv.scala 18:8]
  wire  _out_different_T_15 = in[1] == in[0] ? 1'h0 : 1'h1; // @[Gatesv.scala 19:8]
  wire [1:0] out_different_lo = {_out_different_T_11,_out_different_T_15}; // @[Cat.scala 33:92]
  wire [1:0] out_different_hi = {_out_different_T_3,_out_different_T_7}; // @[Cat.scala 33:92]
  assign out_both = {out_both_hi,_out_both_T_8}; // @[Cat.scala 33:92]
  assign out_any = {out_any_hi,_out_any_T_8}; // @[Cat.scala 33:92]
  assign out_different = {out_different_hi,out_different_lo}; // @[Cat.scala 33:92]
endmodule
