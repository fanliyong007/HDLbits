module Truthtable1(
  input   x3,
  input   x2,
  input   x1,
  output  f
);
  assign f = ~x1 & x2 & ~x3 | x1 & x2 & ~x3 | x1 & ~x2 & x3 | x1 & x2 & x3; // @[Truthtable1.scala 11:69]
endmodule
