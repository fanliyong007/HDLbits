module GCD(
  input  [31:0] io_ina,
  input  [31:0] io_inb,
  output [63:0] io_out
);
  assign io_out = {io_ina,io_inb}; // @[Cat.scala 33:92]
endmodule
