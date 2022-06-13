module Notgate(
  input   io_in,
  output  io_out
);
  assign io_out = ~io_in; // @[Notgate.scala 11:13]
endmodule
