module m2014_q3(
  input  [3:0] x,
  output       f
);
  assign f = x[2] & ~x[0] | ~x[2] & x[0] & x[1]; // @[m2014_q3.scala 9:23]
endmodule
