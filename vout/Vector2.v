module Vector2(
  input  [31:0] io_in,
  output [31:0] io_out
);
  assign io_out = {{24'd0}, io_in[7:0]}; // @[Vector2.scala 18:12]
endmodule
