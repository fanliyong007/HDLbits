module ece241_2014_q1c(
  input        clock,
  input        reset,
  input  [7:0] a,
  input  [7:0] b,
  output [7:0] s,
  output       overflow
);
  assign s = a + b; // @[ece241_2014_q1c.scala 13:9]
  assign overflow = ~(a[7] ^ b[7]) & s[7] != a[7]; // @[ece241_2014_q1c.scala 14:32]
endmodule
