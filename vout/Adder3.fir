FIRRTL version 1.1.0
circuit Adder3 :
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

  module Adder :
    input clock : Clock
    input reset : Reset
    output io : { flip A : UInt<3>, flip B : UInt<3>, flip Cin : UInt<1>, Sum : UInt<3>, Cout : UInt<3>}

    inst FullAdder of FullAdder @[Adder.scala 19:35]
    FullAdder.clock <= clock
    FullAdder.reset <= reset
    inst FullAdder_1 of FullAdder_1 @[Adder.scala 19:35]
    FullAdder_1.clock <= clock
    FullAdder_1.reset <= reset
    inst FullAdder_2 of FullAdder_2 @[Adder.scala 19:35]
    FullAdder_2.clock <= clock
    FullAdder_2.reset <= reset
    wire carry : UInt<1>[4] @[Adder.scala 20:19]
    wire sum : UInt<1>[3] @[Adder.scala 21:19]
    wire mycout : UInt<1>[3] @[Adder.scala 22:20]
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
    node io_Sum_hi = cat(sum[2], sum[1]) @[Adder.scala 34:17]
    node _io_Sum_T = cat(io_Sum_hi, sum[0]) @[Adder.scala 34:17]
    io.Sum <= _io_Sum_T @[Adder.scala 34:10]
    node io_Cout_hi = cat(mycout[2], mycout[1]) @[Adder.scala 35:21]
    node _io_Cout_T = cat(io_Cout_hi, mycout[0]) @[Adder.scala 35:21]
    io.Cout <= _io_Cout_T @[Adder.scala 35:11]

  module Adder3 :
    input clock : Clock
    input reset : UInt<1>
    input a : UInt<3>
    input b : UInt<3>
    input cin : UInt<1>
    output cout : UInt<3>
    output sum : UInt<3>

    inst myadder of Adder @[Adder3.scala 14:23]
    myadder.clock <= clock
    myadder.reset <= reset
    myadder.io.A <= a @[Adder3.scala 15:16]
    myadder.io.B <= b @[Adder3.scala 16:16]
    myadder.io.Cin <= cin @[Adder3.scala 17:18]
    cout <= myadder.io.Cout @[Adder3.scala 18:8]
    sum <= myadder.io.Sum @[Adder3.scala 19:7]

