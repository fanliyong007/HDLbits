module Q4e(
  input   in1,
  input   in2,
  output  out
);
  assign out = ~(in1 | in2); // @[Q4e.scala 10:10]
endmodule
