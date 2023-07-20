module FullAdder(
  input   io_a,
  input   io_b,
  input   io_cin,
  output  io_sum,
  output  io_cout
);
  wire  a_xor_b = io_a ^ io_b; // @[FullAdder.scala 15:22]
  wire  a_and_b = io_a & io_b; // @[FullAdder.scala 18:22]
  wire  b_and_cin = io_b & io_cin; // @[FullAdder.scala 19:24]
  wire  a_and_cin = io_a & io_cin; // @[FullAdder.scala 20:24]
  assign io_sum = a_xor_b ^ io_cin; // @[FullAdder.scala 16:21]
  assign io_cout = a_and_b | b_and_cin | a_and_cin; // @[FullAdder.scala 21:34]
endmodule
module Adder(
  input  [2:0] io_A,
  input  [2:0] io_B,
  input        io_Cin,
  output [2:0] io_Sum,
  output [2:0] io_Cout
);
  wire  FullAdder_io_a; // @[Adder.scala 19:35]
  wire  FullAdder_io_b; // @[Adder.scala 19:35]
  wire  FullAdder_io_cin; // @[Adder.scala 19:35]
  wire  FullAdder_io_sum; // @[Adder.scala 19:35]
  wire  FullAdder_io_cout; // @[Adder.scala 19:35]
  wire  FullAdder_1_io_a; // @[Adder.scala 19:35]
  wire  FullAdder_1_io_b; // @[Adder.scala 19:35]
  wire  FullAdder_1_io_cin; // @[Adder.scala 19:35]
  wire  FullAdder_1_io_sum; // @[Adder.scala 19:35]
  wire  FullAdder_1_io_cout; // @[Adder.scala 19:35]
  wire  FullAdder_2_io_a; // @[Adder.scala 19:35]
  wire  FullAdder_2_io_b; // @[Adder.scala 19:35]
  wire  FullAdder_2_io_cin; // @[Adder.scala 19:35]
  wire  FullAdder_2_io_sum; // @[Adder.scala 19:35]
  wire  FullAdder_2_io_cout; // @[Adder.scala 19:35]
  wire  sum_0 = FullAdder_io_sum; // @[Adder.scala 32:26]
  wire  sum_1 = FullAdder_1_io_sum; // @[Adder.scala 32:26]
  wire  sum_2 = FullAdder_2_io_sum; // @[Adder.scala 32:26]
  wire [1:0] io_Sum_hi = {sum_2,sum_1}; // @[Adder.scala 34:17]
  wire  mycout_2 = FullAdder_2_io_cout; // @[Adder.scala 22:20 31:15]
  wire  mycout_1 = FullAdder_1_io_cout; // @[Adder.scala 22:20 31:15]
  wire [1:0] io_Cout_hi = {mycout_2,mycout_1}; // @[Adder.scala 35:21]
  wire  mycout_0 = FullAdder_io_cout; // @[Adder.scala 22:20 31:15]
  FullAdder FullAdder ( // @[Adder.scala 19:35]
    .io_a(FullAdder_io_a),
    .io_b(FullAdder_io_b),
    .io_cin(FullAdder_io_cin),
    .io_sum(FullAdder_io_sum),
    .io_cout(FullAdder_io_cout)
  );
  FullAdder FullAdder_1 ( // @[Adder.scala 19:35]
    .io_a(FullAdder_1_io_a),
    .io_b(FullAdder_1_io_b),
    .io_cin(FullAdder_1_io_cin),
    .io_sum(FullAdder_1_io_sum),
    .io_cout(FullAdder_1_io_cout)
  );
  FullAdder FullAdder_2 ( // @[Adder.scala 19:35]
    .io_a(FullAdder_2_io_a),
    .io_b(FullAdder_2_io_b),
    .io_cin(FullAdder_2_io_cin),
    .io_sum(FullAdder_2_io_sum),
    .io_cout(FullAdder_2_io_cout)
  );
  assign io_Sum = {io_Sum_hi,sum_0}; // @[Adder.scala 34:17]
  assign io_Cout = {io_Cout_hi,mycout_0}; // @[Adder.scala 35:21]
  assign FullAdder_io_a = io_A[0]; // @[Adder.scala 27:21]
  assign FullAdder_io_b = io_B[0]; // @[Adder.scala 28:21]
  assign FullAdder_io_cin = io_Cin; // @[Adder.scala 20:19 24:12]
  assign FullAdder_1_io_a = io_A[1]; // @[Adder.scala 27:21]
  assign FullAdder_1_io_b = io_B[1]; // @[Adder.scala 28:21]
  assign FullAdder_1_io_cin = FullAdder_io_cout; // @[Adder.scala 20:19 30:16]
  assign FullAdder_2_io_a = io_A[2]; // @[Adder.scala 27:21]
  assign FullAdder_2_io_b = io_B[2]; // @[Adder.scala 28:21]
  assign FullAdder_2_io_cin = FullAdder_1_io_cout; // @[Adder.scala 20:19 30:16]
endmodule
module Adder3(
  input        clock,
  input        reset,
  input  [2:0] a,
  input  [2:0] b,
  input        cin,
  output [2:0] cout,
  output [2:0] sum
);
  wire [2:0] myadder_io_A; // @[Adder3.scala 14:23]
  wire [2:0] myadder_io_B; // @[Adder3.scala 14:23]
  wire  myadder_io_Cin; // @[Adder3.scala 14:23]
  wire [2:0] myadder_io_Sum; // @[Adder3.scala 14:23]
  wire [2:0] myadder_io_Cout; // @[Adder3.scala 14:23]
  Adder myadder ( // @[Adder3.scala 14:23]
    .io_A(myadder_io_A),
    .io_B(myadder_io_B),
    .io_Cin(myadder_io_Cin),
    .io_Sum(myadder_io_Sum),
    .io_Cout(myadder_io_Cout)
  );
  assign cout = myadder_io_Cout; // @[Adder3.scala 18:8]
  assign sum = myadder_io_Sum; // @[Adder3.scala 19:7]
  assign myadder_io_A = a; // @[Adder3.scala 15:16]
  assign myadder_io_B = b; // @[Adder3.scala 16:16]
  assign myadder_io_Cin = cin; // @[Adder3.scala 17:18]
endmodule
