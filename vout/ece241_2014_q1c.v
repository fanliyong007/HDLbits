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
  input  [7:0] io_A,
  input  [7:0] io_B,
  output [7:0] io_Sum,
  output [7:0] io_Cout
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
  wire  FullAdder_3_io_a; // @[Adder.scala 19:35]
  wire  FullAdder_3_io_b; // @[Adder.scala 19:35]
  wire  FullAdder_3_io_cin; // @[Adder.scala 19:35]
  wire  FullAdder_3_io_sum; // @[Adder.scala 19:35]
  wire  FullAdder_3_io_cout; // @[Adder.scala 19:35]
  wire  FullAdder_4_io_a; // @[Adder.scala 19:35]
  wire  FullAdder_4_io_b; // @[Adder.scala 19:35]
  wire  FullAdder_4_io_cin; // @[Adder.scala 19:35]
  wire  FullAdder_4_io_sum; // @[Adder.scala 19:35]
  wire  FullAdder_4_io_cout; // @[Adder.scala 19:35]
  wire  FullAdder_5_io_a; // @[Adder.scala 19:35]
  wire  FullAdder_5_io_b; // @[Adder.scala 19:35]
  wire  FullAdder_5_io_cin; // @[Adder.scala 19:35]
  wire  FullAdder_5_io_sum; // @[Adder.scala 19:35]
  wire  FullAdder_5_io_cout; // @[Adder.scala 19:35]
  wire  FullAdder_6_io_a; // @[Adder.scala 19:35]
  wire  FullAdder_6_io_b; // @[Adder.scala 19:35]
  wire  FullAdder_6_io_cin; // @[Adder.scala 19:35]
  wire  FullAdder_6_io_sum; // @[Adder.scala 19:35]
  wire  FullAdder_6_io_cout; // @[Adder.scala 19:35]
  wire  FullAdder_7_io_a; // @[Adder.scala 19:35]
  wire  FullAdder_7_io_b; // @[Adder.scala 19:35]
  wire  FullAdder_7_io_cin; // @[Adder.scala 19:35]
  wire  FullAdder_7_io_sum; // @[Adder.scala 19:35]
  wire  FullAdder_7_io_cout; // @[Adder.scala 19:35]
  wire  sum_0 = FullAdder_io_sum; // @[Adder.scala 32:26]
  wire  sum_1 = FullAdder_1_io_sum; // @[Adder.scala 32:26]
  wire  sum_2 = FullAdder_2_io_sum; // @[Adder.scala 32:26]
  wire  sum_3 = FullAdder_3_io_sum; // @[Adder.scala 32:26]
  wire  sum_4 = FullAdder_4_io_sum; // @[Adder.scala 32:26]
  wire  sum_5 = FullAdder_5_io_sum; // @[Adder.scala 32:26]
  wire  sum_6 = FullAdder_6_io_sum; // @[Adder.scala 32:26]
  wire  sum_7 = FullAdder_7_io_sum; // @[Adder.scala 32:26]
  wire [3:0] io_Sum_lo = {sum_3,sum_2,sum_1,sum_0}; // @[Adder.scala 34:17]
  wire [3:0] io_Sum_hi = {sum_7,sum_6,sum_5,sum_4}; // @[Adder.scala 34:17]
  wire  mycout_1 = FullAdder_1_io_cout; // @[Adder.scala 22:20 31:15]
  wire  mycout_0 = FullAdder_io_cout; // @[Adder.scala 22:20 31:15]
  wire  mycout_3 = FullAdder_3_io_cout; // @[Adder.scala 22:20 31:15]
  wire  mycout_2 = FullAdder_2_io_cout; // @[Adder.scala 22:20 31:15]
  wire [3:0] io_Cout_lo = {mycout_3,mycout_2,mycout_1,mycout_0}; // @[Adder.scala 35:21]
  wire  mycout_5 = FullAdder_5_io_cout; // @[Adder.scala 22:20 31:15]
  wire  mycout_4 = FullAdder_4_io_cout; // @[Adder.scala 22:20 31:15]
  wire  mycout_7 = FullAdder_7_io_cout; // @[Adder.scala 22:20 31:15]
  wire  mycout_6 = FullAdder_6_io_cout; // @[Adder.scala 22:20 31:15]
  wire [3:0] io_Cout_hi = {mycout_7,mycout_6,mycout_5,mycout_4}; // @[Adder.scala 35:21]
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
  FullAdder FullAdder_3 ( // @[Adder.scala 19:35]
    .io_a(FullAdder_3_io_a),
    .io_b(FullAdder_3_io_b),
    .io_cin(FullAdder_3_io_cin),
    .io_sum(FullAdder_3_io_sum),
    .io_cout(FullAdder_3_io_cout)
  );
  FullAdder FullAdder_4 ( // @[Adder.scala 19:35]
    .io_a(FullAdder_4_io_a),
    .io_b(FullAdder_4_io_b),
    .io_cin(FullAdder_4_io_cin),
    .io_sum(FullAdder_4_io_sum),
    .io_cout(FullAdder_4_io_cout)
  );
  FullAdder FullAdder_5 ( // @[Adder.scala 19:35]
    .io_a(FullAdder_5_io_a),
    .io_b(FullAdder_5_io_b),
    .io_cin(FullAdder_5_io_cin),
    .io_sum(FullAdder_5_io_sum),
    .io_cout(FullAdder_5_io_cout)
  );
  FullAdder FullAdder_6 ( // @[Adder.scala 19:35]
    .io_a(FullAdder_6_io_a),
    .io_b(FullAdder_6_io_b),
    .io_cin(FullAdder_6_io_cin),
    .io_sum(FullAdder_6_io_sum),
    .io_cout(FullAdder_6_io_cout)
  );
  FullAdder FullAdder_7 ( // @[Adder.scala 19:35]
    .io_a(FullAdder_7_io_a),
    .io_b(FullAdder_7_io_b),
    .io_cin(FullAdder_7_io_cin),
    .io_sum(FullAdder_7_io_sum),
    .io_cout(FullAdder_7_io_cout)
  );
  assign io_Sum = {io_Sum_hi,io_Sum_lo}; // @[Adder.scala 34:17]
  assign io_Cout = {io_Cout_hi,io_Cout_lo}; // @[Adder.scala 35:21]
  assign FullAdder_io_a = io_A[0]; // @[Adder.scala 27:21]
  assign FullAdder_io_b = io_B[0]; // @[Adder.scala 28:21]
  assign FullAdder_io_cin = 1'h0; // @[Adder.scala 20:19 24:12]
  assign FullAdder_1_io_a = io_A[1]; // @[Adder.scala 27:21]
  assign FullAdder_1_io_b = io_B[1]; // @[Adder.scala 28:21]
  assign FullAdder_1_io_cin = FullAdder_io_cout; // @[Adder.scala 20:19 30:16]
  assign FullAdder_2_io_a = io_A[2]; // @[Adder.scala 27:21]
  assign FullAdder_2_io_b = io_B[2]; // @[Adder.scala 28:21]
  assign FullAdder_2_io_cin = FullAdder_1_io_cout; // @[Adder.scala 20:19 30:16]
  assign FullAdder_3_io_a = io_A[3]; // @[Adder.scala 27:21]
  assign FullAdder_3_io_b = io_B[3]; // @[Adder.scala 28:21]
  assign FullAdder_3_io_cin = FullAdder_2_io_cout; // @[Adder.scala 20:19 30:16]
  assign FullAdder_4_io_a = io_A[4]; // @[Adder.scala 27:21]
  assign FullAdder_4_io_b = io_B[4]; // @[Adder.scala 28:21]
  assign FullAdder_4_io_cin = FullAdder_3_io_cout; // @[Adder.scala 20:19 30:16]
  assign FullAdder_5_io_a = io_A[5]; // @[Adder.scala 27:21]
  assign FullAdder_5_io_b = io_B[5]; // @[Adder.scala 28:21]
  assign FullAdder_5_io_cin = FullAdder_4_io_cout; // @[Adder.scala 20:19 30:16]
  assign FullAdder_6_io_a = io_A[6]; // @[Adder.scala 27:21]
  assign FullAdder_6_io_b = io_B[6]; // @[Adder.scala 28:21]
  assign FullAdder_6_io_cin = FullAdder_5_io_cout; // @[Adder.scala 20:19 30:16]
  assign FullAdder_7_io_a = io_A[7]; // @[Adder.scala 27:21]
  assign FullAdder_7_io_b = io_B[7]; // @[Adder.scala 28:21]
  assign FullAdder_7_io_cin = FullAdder_6_io_cout; // @[Adder.scala 20:19 30:16]
endmodule
module ece241_2014_q1c(
  input        clock,
  input        reset,
  input  [7:0] a,
  input  [7:0] b,
  output [7:0] s,
  output       overflow
);
  wire [7:0] myadder_io_A; // @[ece241_2014_q1c.scala 14:23]
  wire [7:0] myadder_io_B; // @[ece241_2014_q1c.scala 14:23]
  wire [7:0] myadder_io_Sum; // @[ece241_2014_q1c.scala 14:23]
  wire [7:0] myadder_io_Cout; // @[ece241_2014_q1c.scala 14:23]
  Adder myadder ( // @[ece241_2014_q1c.scala 14:23]
    .io_A(myadder_io_A),
    .io_B(myadder_io_B),
    .io_Sum(myadder_io_Sum),
    .io_Cout(myadder_io_Cout)
  );
  assign s = myadder_io_Sum; // @[ece241_2014_q1c.scala 19:5]
  assign overflow = myadder_io_Cout[7]; // @[ece241_2014_q1c.scala 18:30]
  assign myadder_io_A = a; // @[ece241_2014_q1c.scala 15:16]
  assign myadder_io_B = b; // @[ece241_2014_q1c.scala 16:16]
endmodule
