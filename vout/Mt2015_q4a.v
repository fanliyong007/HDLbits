module Mt2015_q4a(
  input   x,
  input   y,
  output  z
);
  assign z = (x ^ y) & x; // @[Mt2015_q4a.scala 10:18]
endmodule
