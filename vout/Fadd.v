module Fadd(
  input   a,
  input   b,
  input   cin,
  output  sum,
  output  cout
);
  assign sum = a ^ b ^ cin; // @[Fadd.scala 13:16]
  assign cout = a & b | a & cin | b & cin; // @[Fadd.scala 14:26]
endmodule
