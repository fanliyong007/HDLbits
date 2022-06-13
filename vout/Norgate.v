module Norgate(
  input   a,
  input   b,
  output  out
);
  assign out = ~(a | b); // @[Norgate.scala 12:13]
endmodule
