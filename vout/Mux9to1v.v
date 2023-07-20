module Mux9to1v(
  input  [15:0] a,
  input  [15:0] b,
  input  [15:0] c,
  input  [15:0] d,
  input  [15:0] e,
  input  [15:0] f,
  input  [15:0] g,
  input  [15:0] h,
  input  [15:0] i,
  input  [3:0]  sel,
  output [15:0] out
);
  wire  _out_T = sel == 4'h0; // @[Mux9to1v.scala 20:16]
  wire  _out_T_1 = sel == 4'h1; // @[Mux9to1v.scala 21:12]
  wire  _out_T_2 = sel == 4'h2; // @[Mux9to1v.scala 22:12]
  wire  _out_T_3 = sel == 4'h3; // @[Mux9to1v.scala 23:12]
  wire  _out_T_4 = sel == 4'h4; // @[Mux9to1v.scala 24:12]
  wire  _out_T_5 = sel == 4'h5; // @[Mux9to1v.scala 25:12]
  wire  _out_T_6 = sel == 4'h6; // @[Mux9to1v.scala 26:12]
  wire  _out_T_7 = sel == 4'h7; // @[Mux9to1v.scala 27:12]
  wire  _out_T_8 = sel == 4'h8; // @[Mux9to1v.scala 28:12]
  wire [15:0] _out_T_9 = _out_T_8 ? i : 16'hffff; // @[Mux.scala 139:16]
  wire [15:0] _out_T_10 = _out_T_7 ? h : _out_T_9; // @[Mux.scala 139:16]
  wire [15:0] _out_T_11 = _out_T_6 ? g : _out_T_10; // @[Mux.scala 139:16]
  wire [15:0] _out_T_12 = _out_T_5 ? f : _out_T_11; // @[Mux.scala 139:16]
  wire [15:0] _out_T_13 = _out_T_4 ? e : _out_T_12; // @[Mux.scala 139:16]
  wire [15:0] _out_T_14 = _out_T_3 ? d : _out_T_13; // @[Mux.scala 139:16]
  wire [15:0] _out_T_15 = _out_T_2 ? c : _out_T_14; // @[Mux.scala 139:16]
  wire [15:0] _out_T_16 = _out_T_1 ? b : _out_T_15; // @[Mux.scala 139:16]
  assign out = _out_T ? a : _out_T_16; // @[Mux.scala 139:16]
endmodule
