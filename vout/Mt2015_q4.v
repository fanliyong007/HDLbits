module Mt2015_q4(
  input   x,
  input   y,
  output  z
);
  wire  _A1_T = x ^ y; // @[Mt2015_q4.scala 14:12]
  wire  A1 = (x ^ y) & x; // @[Mt2015_q4.scala 14:18]
  wire  A2 = ~_A1_T; // @[Mt2015_q4.scala 16:8]
  assign z = (A1 | A1) ^ A2 & A2; // @[Mt2015_q4.scala 18:16]
endmodule
