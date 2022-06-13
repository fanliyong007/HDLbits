module Vector0(
  input  [2:0] io_vec,
  output [2:0] io_outv,
  output       io_o2,
  output       io_o1,
  output       io_o0
);
  assign io_outv = io_vec; // @[Vector0.scala 14:10]
  assign io_o2 = io_vec[2]; // @[Vector0.scala 15:16]
  assign io_o1 = io_vec[1]; // @[Vector0.scala 16:16]
  assign io_o0 = io_vec[0]; // @[Vector0.scala 17:16]
endmodule
