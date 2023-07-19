module Gates(
  input   a,
  input   b,
  output  out_and,
  output  out_or,
  output  out_xor,
  output  out_nand,
  output  out_nor,
  output  out_xnor,
  output  out_anotb
);
  wire  _out_and_T = a & b; // @[Gates.scala 15:16]
  wire  _out_or_T = a | b; // @[Gates.scala 16:15]
  wire  _out_xor_T = a ^ b; // @[Gates.scala 17:16]
  assign out_and = a & b; // @[Gates.scala 15:16]
  assign out_or = a | b; // @[Gates.scala 16:15]
  assign out_xor = a ^ b; // @[Gates.scala 17:16]
  assign out_nand = ~_out_and_T; // @[Gates.scala 18:15]
  assign out_nor = ~_out_or_T; // @[Gates.scala 19:14]
  assign out_xnor = ~_out_xor_T; // @[Gates.scala 20:15]
  assign out_anotb = a & ~b; // @[Gates.scala 21:18]
endmodule
