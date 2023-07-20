module Mux2to1(
  input   a,
  input   b,
  input   sel,
  output  out
);
  assign out = sel ? b : a; // @[Mux2to1.scala 11:11]
endmodule
