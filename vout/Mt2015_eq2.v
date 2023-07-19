module Mt2015_eq2(
  input  [1:0] A,
  input  [1:0] B,
  output       z
);
  assign z = A == B; // @[Mt2015_eq2.scala 11:10]
endmodule
