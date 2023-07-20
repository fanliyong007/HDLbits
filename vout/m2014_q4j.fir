FIRRTL version 1.1.0
circuit m2014_q4j :
  module FullAdder :
    input clock : Clock
    input reset : Reset
    output io : { flip a : UInt<1>, flip b : UInt<1>, flip cin : UInt<1>, sum : UInt<1>, cout : UInt<1>}

    node a_xor_b = xor(io.a, io.b) @[FullAdder.scala 15:22]
    node _io_sum_T = xor(a_xor_b, io.cin) @[FullAdder.scala 16:21]
    io.sum <= _io_sum_T @[FullAdder.scala 16:10]
    node a_and_b = and(io.a, io.b) @[FullAdder.scala 18:22]
    node b_and_cin = and(io.b, io.cin) @[FullAdder.scala 19:24]
    node a_and_cin = and(io.a, io.cin) @[FullAdder.scala 20:24]
    node _io_cout_T = or(a_and_b, b_and_cin) @[FullAdder.scala 21:22]
    node _io_cout_T_1 = or(_io_cout_T, a_and_cin) @[FullAdder.scala 21:34]
    io.cout <= _io_cout_T_1 @[FullAdder.scala 21:11]

  module FullAdder_1 :
    input clock : Clock
    input reset : Reset
    output io : { flip a : UInt<1>, flip b : UInt<1>, flip cin : UInt<1>, sum : UInt<1>, cout : UInt<1>}

    node a_xor_b = xor(io.a, io.b) @[FullAdder.scala 15:22]
    node _io_sum_T = xor(a_xor_b, io.cin) @[FullAdder.scala 16:21]
    io.sum <= _io_sum_T @[FullAdder.scala 16:10]
    node a_and_b = and(io.a, io.b) @[FullAdder.scala 18:22]
    node b_and_cin = and(io.b, io.cin) @[FullAdder.scala 19:24]
    node a_and_cin = and(io.a, io.cin) @[FullAdder.scala 20:24]
    node _io_cout_T = or(a_and_b, b_and_cin) @[FullAdder.scala 21:22]
    node _io_cout_T_1 = or(_io_cout_T, a_and_cin) @[FullAdder.scala 21:34]
    io.cout <= _io_cout_T_1 @[FullAdder.scala 21:11]

  module FullAdder_2 :
    input clock : Clock
    input reset : Reset
    output io : { flip a : UInt<1>, flip b : UInt<1>, flip cin : UInt<1>, sum : UInt<1>, cout : UInt<1>}

    node a_xor_b = xor(io.a, io.b) @[FullAdder.scala 15:22]
    node _io_sum_T = xor(a_xor_b, io.cin) @[FullAdder.scala 16:21]
    io.sum <= _io_sum_T @[FullAdder.scala 16:10]
    node a_and_b = and(io.a, io.b) @[FullAdder.scala 18:22]
    node b_and_cin = and(io.b, io.cin) @[FullAdder.scala 19:24]
    node a_and_cin = and(io.a, io.cin) @[FullAdder.scala 20:24]
    node _io_cout_T = or(a_and_b, b_and_cin) @[FullAdder.scala 21:22]
    node _io_cout_T_1 = or(_io_cout_T, a_and_cin) @[FullAdder.scala 21:34]
    io.cout <= _io_cout_T_1 @[FullAdder.scala 21:11]

  module FullAdder_3 :
    input clock : Clock
    input reset : Reset
    output io : { flip a : UInt<1>, flip b : UInt<1>, flip cin : UInt<1>, sum : UInt<1>, cout : UInt<1>}

    node a_xor_b = xor(io.a, io.b) @[FullAdder.scala 15:22]
    node _io_sum_T = xor(a_xor_b, io.cin) @[FullAdder.scala 16:21]
    io.sum <= _io_sum_T @[FullAdder.scala 16:10]
    node a_and_b = and(io.a, io.b) @[FullAdder.scala 18:22]
    node b_and_cin = and(io.b, io.cin) @[FullAdder.scala 19:24]
    node a_and_cin = and(io.a, io.cin) @[FullAdder.scala 20:24]
    node _io_cout_T = or(a_and_b, b_and_cin) @[FullAdder.scala 21:22]
    node _io_cout_T_1 = or(_io_cout_T, a_and_cin) @[FullAdder.scala 21:34]
    io.cout <= _io_cout_T_1 @[FullAdder.scala 21:11]

  module FullAdder_4 :
    input clock : Clock
    input reset : Reset
    output io : { flip a : UInt<1>, flip b : UInt<1>, flip cin : UInt<1>, sum : UInt<1>, cout : UInt<1>}

    node a_xor_b = xor(io.a, io.b) @[FullAdder.scala 15:22]
    node _io_sum_T = xor(a_xor_b, io.cin) @[FullAdder.scala 16:21]
    io.sum <= _io_sum_T @[FullAdder.scala 16:10]
    node a_and_b = and(io.a, io.b) @[FullAdder.scala 18:22]
    node b_and_cin = and(io.b, io.cin) @[FullAdder.scala 19:24]
    node a_and_cin = and(io.a, io.cin) @[FullAdder.scala 20:24]
    node _io_cout_T = or(a_and_b, b_and_cin) @[FullAdder.scala 21:22]
    node _io_cout_T_1 = or(_io_cout_T, a_and_cin) @[FullAdder.scala 21:34]
    io.cout <= _io_cout_T_1 @[FullAdder.scala 21:11]

  module Adder :
    input clock : Clock
    input reset : Reset
    output io : { flip A : UInt<5>, flip B : UInt<5>, flip Cin : UInt<1>, Sum : UInt<5>, Cout : UInt<5>}

    inst FullAdder of FullAdder @[Adder.scala 19:35]
    FullAdder.clock <= clock
    FullAdder.reset <= reset
    inst FullAdder_1 of FullAdder_1 @[Adder.scala 19:35]
    FullAdder_1.clock <= clock
    FullAdder_1.reset <= reset
    inst FullAdder_2 of FullAdder_2 @[Adder.scala 19:35]
    FullAdder_2.clock <= clock
    FullAdder_2.reset <= reset
    inst FullAdder_3 of FullAdder_3 @[Adder.scala 19:35]
    FullAdder_3.clock <= clock
    FullAdder_3.reset <= reset
    inst FullAdder_4 of FullAdder_4 @[Adder.scala 19:35]
    FullAdder_4.clock <= clock
    FullAdder_4.reset <= reset
    wire carry : UInt<1>[6] @[Adder.scala 20:19]
    wire sum : UInt<1>[5] @[Adder.scala 21:19]
    wire mycout : UInt<1>[5] @[Adder.scala 22:20]
    carry[0] <= io.Cin @[Adder.scala 24:12]
    mycout[0] <= io.Cin @[Adder.scala 25:13]
    node _T = bits(io.A, 0, 0) @[Adder.scala 27:21]
    FullAdder.io.a <= _T @[Adder.scala 27:14]
    node _T_1 = bits(io.B, 0, 0) @[Adder.scala 28:21]
    FullAdder.io.b <= _T_1 @[Adder.scala 28:14]
    FullAdder.io.cin <= carry[0] @[Adder.scala 29:16]
    carry[1] <= FullAdder.io.cout @[Adder.scala 30:16]
    mycout[0] <= FullAdder.io.cout @[Adder.scala 31:15]
    node _sum_0_T = bits(FullAdder.io.sum, 0, 0) @[Adder.scala 32:26]
    sum[0] <= _sum_0_T @[Adder.scala 32:12]
    node _T_2 = bits(io.A, 1, 1) @[Adder.scala 27:21]
    FullAdder_1.io.a <= _T_2 @[Adder.scala 27:14]
    node _T_3 = bits(io.B, 1, 1) @[Adder.scala 28:21]
    FullAdder_1.io.b <= _T_3 @[Adder.scala 28:14]
    FullAdder_1.io.cin <= carry[1] @[Adder.scala 29:16]
    carry[2] <= FullAdder_1.io.cout @[Adder.scala 30:16]
    mycout[1] <= FullAdder_1.io.cout @[Adder.scala 31:15]
    node _sum_1_T = bits(FullAdder_1.io.sum, 0, 0) @[Adder.scala 32:26]
    sum[1] <= _sum_1_T @[Adder.scala 32:12]
    node _T_4 = bits(io.A, 2, 2) @[Adder.scala 27:21]
    FullAdder_2.io.a <= _T_4 @[Adder.scala 27:14]
    node _T_5 = bits(io.B, 2, 2) @[Adder.scala 28:21]
    FullAdder_2.io.b <= _T_5 @[Adder.scala 28:14]
    FullAdder_2.io.cin <= carry[2] @[Adder.scala 29:16]
    carry[3] <= FullAdder_2.io.cout @[Adder.scala 30:16]
    mycout[2] <= FullAdder_2.io.cout @[Adder.scala 31:15]
    node _sum_2_T = bits(FullAdder_2.io.sum, 0, 0) @[Adder.scala 32:26]
    sum[2] <= _sum_2_T @[Adder.scala 32:12]
    node _T_6 = bits(io.A, 3, 3) @[Adder.scala 27:21]
    FullAdder_3.io.a <= _T_6 @[Adder.scala 27:14]
    node _T_7 = bits(io.B, 3, 3) @[Adder.scala 28:21]
    FullAdder_3.io.b <= _T_7 @[Adder.scala 28:14]
    FullAdder_3.io.cin <= carry[3] @[Adder.scala 29:16]
    carry[4] <= FullAdder_3.io.cout @[Adder.scala 30:16]
    mycout[3] <= FullAdder_3.io.cout @[Adder.scala 31:15]
    node _sum_3_T = bits(FullAdder_3.io.sum, 0, 0) @[Adder.scala 32:26]
    sum[3] <= _sum_3_T @[Adder.scala 32:12]
    node _T_8 = bits(io.A, 4, 4) @[Adder.scala 27:21]
    FullAdder_4.io.a <= _T_8 @[Adder.scala 27:14]
    node _T_9 = bits(io.B, 4, 4) @[Adder.scala 28:21]
    FullAdder_4.io.b <= _T_9 @[Adder.scala 28:14]
    FullAdder_4.io.cin <= carry[4] @[Adder.scala 29:16]
    carry[5] <= FullAdder_4.io.cout @[Adder.scala 30:16]
    mycout[4] <= FullAdder_4.io.cout @[Adder.scala 31:15]
    node _sum_4_T = bits(FullAdder_4.io.sum, 0, 0) @[Adder.scala 32:26]
    sum[4] <= _sum_4_T @[Adder.scala 32:12]
    node io_Sum_lo = cat(sum[1], sum[0]) @[Adder.scala 34:17]
    node io_Sum_hi_hi = cat(sum[4], sum[3]) @[Adder.scala 34:17]
    node io_Sum_hi = cat(io_Sum_hi_hi, sum[2]) @[Adder.scala 34:17]
    node _io_Sum_T = cat(io_Sum_hi, io_Sum_lo) @[Adder.scala 34:17]
    io.Sum <= _io_Sum_T @[Adder.scala 34:10]
    node io_Cout_lo = cat(mycout[1], mycout[0]) @[Adder.scala 35:21]
    node io_Cout_hi_hi = cat(mycout[4], mycout[3]) @[Adder.scala 35:21]
    node io_Cout_hi = cat(io_Cout_hi_hi, mycout[2]) @[Adder.scala 35:21]
    node _io_Cout_T = cat(io_Cout_hi, io_Cout_lo) @[Adder.scala 35:21]
    io.Cout <= _io_Cout_T @[Adder.scala 35:11]

  module m2014_q4j :
    input clock : Clock
    input reset : UInt<1>
    input x : UInt<4>
    input y : UInt<4>
    output sum : UInt<5>

    inst myadder of Adder @[m2014_q4j.scala 11:23]
    myadder.clock <= clock
    myadder.reset <= reset
    myadder.io.Cin <= UInt<1>("h0") @[m2014_q4j.scala 12:18]
    myadder.io.A <= x @[m2014_q4j.scala 13:16]
    myadder.io.B <= y @[m2014_q4j.scala 14:16]
    sum <= myadder.io.Sum @[m2014_q4j.scala 15:7]

