FIRRTL version 1.1.0
circuit m2014_q3 :
  module m2014_q3 :
    input x : UInt<4>
    output f : UInt<1>

    node _f_T = bits(x, 2, 2) @[m2014_q3.scala 9:10]
    node _f_T_1 = bits(x, 0, 0) @[m2014_q3.scala 9:18]
    node _f_T_2 = not(_f_T_1) @[m2014_q3.scala 9:16]
    node _f_T_3 = and(_f_T, _f_T_2) @[m2014_q3.scala 9:14]
    node _f_T_4 = bits(x, 2, 2) @[m2014_q3.scala 9:28]
    node _f_T_5 = not(_f_T_4) @[m2014_q3.scala 9:26]
    node _f_T_6 = bits(x, 0, 0) @[m2014_q3.scala 9:35]
    node _f_T_7 = and(_f_T_5, _f_T_6) @[m2014_q3.scala 9:32]
    node _f_T_8 = bits(x, 1, 1) @[m2014_q3.scala 9:42]
    node _f_T_9 = and(_f_T_7, _f_T_8) @[m2014_q3.scala 9:39]
    node _f_T_10 = or(_f_T_3, _f_T_9) @[m2014_q3.scala 9:23]
    f <= _f_T_10 @[m2014_q3.scala 9:5]

