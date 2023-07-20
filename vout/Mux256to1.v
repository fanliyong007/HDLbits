module Mux256to1(
  input  [255:0] in,
  input  [7:0]   sel,
  output         out
);
  assign out = in >> sel; // @[Mux256to1.scala 10:10]
endmodule
