module Mt2015_q4b(
  input   x,
  input   y,
  output  z
);
  assign z = ~(x ^ y); // @[Mt2015_q4b.scala 10:8]
endmodule
