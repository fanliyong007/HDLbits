FIRRTL version 1.1.0
circuit Hadd :
  module Hadd :
    input a : UInt<1>
    input b : UInt<1>
    output sum : UInt<1>
    output cout : UInt<1>

    node _sum_T = xor(a, b) @[Hadd.scala 11:13]
    sum <= _sum_T @[Hadd.scala 11:8]
    node _cout_T = xor(a, b) @[Hadd.scala 12:14]
    node _cout_T_1 = not(_cout_T) @[Hadd.scala 12:11]
    node _cout_T_2 = and(_cout_T_1, a) @[Hadd.scala 12:18]
    node _cout_T_3 = and(_cout_T_2, b) @[Hadd.scala 12:22]
    cout <= _cout_T_3 @[Hadd.scala 12:8]

