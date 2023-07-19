FIRRTL version 1.1.0
circuit Mt2015_q4 :
  module Mt2015_q4 :
    input x : UInt<1>
    input y : UInt<1>
    output z : UInt<1>

    wire A1 : UInt<1> @[Mt2015_q4.scala 10:14]
    wire A2 : UInt<1> @[Mt2015_q4.scala 11:14]
    wire B1 : UInt<1> @[Mt2015_q4.scala 12:14]
    wire B2 : UInt<1> @[Mt2015_q4.scala 13:14]
    node _A1_T = xor(x, y) @[Mt2015_q4.scala 14:12]
    node _A1_T_1 = and(_A1_T, x) @[Mt2015_q4.scala 14:18]
    A1 <= _A1_T_1 @[Mt2015_q4.scala 14:5]
    node _B1_T = xor(x, y) @[Mt2015_q4.scala 15:12]
    node _B1_T_1 = and(_B1_T, x) @[Mt2015_q4.scala 15:18]
    B1 <= _B1_T_1 @[Mt2015_q4.scala 15:5]
    node _A2_T = xor(x, y) @[Mt2015_q4.scala 16:13]
    node _A2_T_1 = not(_A2_T) @[Mt2015_q4.scala 16:8]
    A2 <= _A2_T_1 @[Mt2015_q4.scala 16:5]
    node _B2_T = xor(x, y) @[Mt2015_q4.scala 17:13]
    node _B2_T_1 = not(_B2_T) @[Mt2015_q4.scala 17:8]
    B2 <= _B2_T_1 @[Mt2015_q4.scala 17:5]
    node _z_T = or(A1, B1) @[Mt2015_q4.scala 18:10]
    node _z_T_1 = and(A2, B2) @[Mt2015_q4.scala 18:22]
    node _z_T_2 = xor(_z_T, _z_T_1) @[Mt2015_q4.scala 18:16]
    z <= _z_T_2 @[Mt2015_q4.scala 18:4]

