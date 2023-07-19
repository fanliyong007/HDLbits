FIRRTL version 1.1.0
circuit Truthtable1 :
  module Truthtable1 :
    input x3 : UInt<1>
    input x2 : UInt<1>
    input x1 : UInt<1>
    output f : UInt<1>

    node _f_T = not(x1) @[Truthtable1.scala 11:10]
    node _f_T_1 = and(_f_T, x2) @[Truthtable1.scala 11:15]
    node _f_T_2 = not(x3) @[Truthtable1.scala 11:23]
    node _f_T_3 = and(_f_T_1, _f_T_2) @[Truthtable1.scala 11:20]
    node _f_T_4 = and(x1, x2) @[Truthtable1.scala 11:35]
    node _f_T_5 = not(x3) @[Truthtable1.scala 11:43]
    node _f_T_6 = and(_f_T_4, _f_T_5) @[Truthtable1.scala 11:40]
    node _f_T_7 = or(_f_T_3, _f_T_6) @[Truthtable1.scala 11:29]
    node _f_T_8 = not(x2) @[Truthtable1.scala 11:58]
    node _f_T_9 = and(x1, _f_T_8) @[Truthtable1.scala 11:55]
    node _f_T_10 = and(_f_T_9, x3) @[Truthtable1.scala 11:63]
    node _f_T_11 = or(_f_T_7, _f_T_10) @[Truthtable1.scala 11:49]
    node _f_T_12 = and(x1, x2) @[Truthtable1.scala 11:75]
    node _f_T_13 = and(_f_T_12, x3) @[Truthtable1.scala 11:80]
    node _f_T_14 = or(_f_T_11, _f_T_13) @[Truthtable1.scala 11:69]
    f <= _f_T_14 @[Truthtable1.scala 11:5]

