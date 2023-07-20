FIRRTL version 1.1.0
circuit Fadd :
  module Fadd :
    input a : UInt<1>
    input b : UInt<1>
    input cin : UInt<1>
    output sum : UInt<1>
    output cout : UInt<1>

    node _sum_T = xor(a, b) @[Fadd.scala 13:12]
    node _sum_T_1 = xor(_sum_T, cin) @[Fadd.scala 13:16]
    sum <= _sum_T_1 @[Fadd.scala 13:7]
    node _cout_T = and(a, b) @[Fadd.scala 14:12]
    node _cout_T_1 = and(a, cin) @[Fadd.scala 14:20]
    node _cout_T_2 = or(_cout_T, _cout_T_1) @[Fadd.scala 14:16]
    node _cout_T_3 = and(b, cin) @[Fadd.scala 14:30]
    node _cout_T_4 = or(_cout_T_2, _cout_T_3) @[Fadd.scala 14:26]
    cout <= _cout_T_4 @[Fadd.scala 14:7]

