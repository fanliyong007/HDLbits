module top_module(
  input  [31:0] a,
  input  [31:0] b,
  output [31:0] sum
);
  wire [15:0] u1_add16_a; // @[Cseladd.scala 30:22]
  wire [15:0] u1_add16_b; // @[Cseladd.scala 30:22]
  wire  u1_add16_cin; // @[Cseladd.scala 30:22]
  wire [15:0] u1_add16_sum; // @[Cseladd.scala 30:22]
  wire  u1_add16_cout; // @[Cseladd.scala 30:22]
  wire [15:0] u2_add16_a; // @[Cseladd.scala 37:22]
  wire [15:0] u2_add16_b; // @[Cseladd.scala 37:22]
  wire  u2_add16_cin; // @[Cseladd.scala 37:22]
  wire [15:0] u2_add16_sum; // @[Cseladd.scala 37:22]
  wire  u2_add16_cout; // @[Cseladd.scala 37:22]
  wire [15:0] u3_add16_a; // @[Cseladd.scala 43:22]
  wire [15:0] u3_add16_b; // @[Cseladd.scala 43:22]
  wire  u3_add16_cin; // @[Cseladd.scala 43:22]
  wire [15:0] u3_add16_sum; // @[Cseladd.scala 43:22]
  wire  u3_add16_cout; // @[Cseladd.scala 43:22]
  wire  cout = u1_add16_cout; // @[Cseladd.scala 25:16 35:7]
  wire [15:0] sum2 = u2_add16_sum; // @[Cseladd.scala 27:16 41:8]
  wire [15:0] sum1 = u1_add16_sum; // @[Cseladd.scala 26:16 34:7]
  wire [31:0] _sum_T = {sum2,sum1}; // @[Cat.scala 33:92]
  wire [15:0] sum3 = u3_add16_sum; // @[Cseladd.scala 28:16 47:8]
  wire [31:0] _sum_T_1 = {sum3,sum1}; // @[Cat.scala 33:92]
  add16 u1_add16 ( // @[Cseladd.scala 30:22]
    .a(u1_add16_a),
    .b(u1_add16_b),
    .cin(u1_add16_cin),
    .sum(u1_add16_sum),
    .cout(u1_add16_cout)
  );
  add16 u2_add16 ( // @[Cseladd.scala 37:22]
    .a(u2_add16_a),
    .b(u2_add16_b),
    .cin(u2_add16_cin),
    .sum(u2_add16_sum),
    .cout(u2_add16_cout)
  );
  add16 u3_add16 ( // @[Cseladd.scala 43:22]
    .a(u3_add16_a),
    .b(u3_add16_b),
    .cin(u3_add16_cin),
    .sum(u3_add16_sum),
    .cout(u3_add16_cout)
  );
  assign sum = ~cout ? _sum_T : _sum_T_1; // @[Cseladd.scala 49:14 50:11 52:11]
  assign u1_add16_a = a[15:0]; // @[Cseladd.scala 31:22]
  assign u1_add16_b = b[15:0]; // @[Cseladd.scala 32:22]
  assign u1_add16_cin = 1'h0; // @[Cseladd.scala 33:18]
  assign u2_add16_a = a[31:16]; // @[Cseladd.scala 38:24]
  assign u2_add16_b = b[31:16]; // @[Cseladd.scala 39:24]
  assign u2_add16_cin = 1'h0; // @[Cseladd.scala 40:18]
  assign u3_add16_a = a[31:16]; // @[Cseladd.scala 44:24]
  assign u3_add16_b = b[31:16]; // @[Cseladd.scala 45:24]
  assign u3_add16_cin = 1'h1; // @[Cseladd.scala 46:19]
endmodule
