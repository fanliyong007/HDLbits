module Q4f(
  input   in1,
  input   in2,
  output  out
);
  assign out = in1 & ~in2; // @[Q4f.scala 10:14]
endmodule
