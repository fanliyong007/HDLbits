module Wire4(
  input   a,
  input   b,
  input   c,
  output  w,
  output  x,
  output  y,
  output  z
);
  assign w = a; // @[Wire4.scala 16:7]
  assign x = b; // @[Wire4.scala 17:7]
  assign y = b; // @[Wire4.scala 18:7]
  assign z = c; // @[Wire4.scala 19:7]
endmodule
