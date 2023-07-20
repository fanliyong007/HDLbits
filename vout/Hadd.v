module Hadd(
  input   a,
  input   b,
  output  sum,
  output  cout
);
  wire  _sum_T = a ^ b; // @[Hadd.scala 11:13]
  assign sum = a ^ b; // @[Hadd.scala 11:13]
  assign cout = ~_sum_T & a & b; // @[Hadd.scala 12:22]
endmodule
