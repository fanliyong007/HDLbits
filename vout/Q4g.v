module Q4g(
  input   in1,
  input   in2,
  input   in3,
  output  out
);
  assign out = ~(in1 ^ in2) ^ in3; // @[Q4g.scala 11:25]
endmodule
