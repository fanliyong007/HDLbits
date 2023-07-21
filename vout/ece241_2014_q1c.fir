circuit ece241_2014_q1c :
  module ece241_2014_q1c :
    input clock : Clock
    input reset : UInt<1>
    input a : UInt<8>
    input b : UInt<8>
    output s : UInt<8>
    output overflow : UInt<1>

    node _s_T = add(a, b) @[ece241_2014_q1c.scala 13:9]
    node _s_T_1 = tail(_s_T, 1) @[ece241_2014_q1c.scala 13:9]
    s <= _s_T_1 @[ece241_2014_q1c.scala 13:5]
    node _overflow_T = bits(a, 7, 7) @[ece241_2014_q1c.scala 14:19]
    node _overflow_T_1 = bits(b, 7, 7) @[ece241_2014_q1c.scala 14:26]
    node _overflow_T_2 = xor(_overflow_T, _overflow_T_1) @[ece241_2014_q1c.scala 14:23]
    node _overflow_T_3 = not(_overflow_T_2) @[ece241_2014_q1c.scala 14:15]
    node _overflow_T_4 = bits(s, 7, 7) @[ece241_2014_q1c.scala 14:37]
    node _overflow_T_5 = bits(a, 7, 7) @[ece241_2014_q1c.scala 14:46]
    node _overflow_T_6 = neq(_overflow_T_4, _overflow_T_5) @[ece241_2014_q1c.scala 14:41]
    node _overflow_T_7 = and(_overflow_T_3, _overflow_T_6) @[ece241_2014_q1c.scala 14:32]
    overflow <= _overflow_T_7 @[ece241_2014_q1c.scala 14:12]

