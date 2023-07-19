FIRRTL version 1.1.0
circuit Mt2015_q4a :
  module Mt2015_q4a :
    input x : UInt<1>
    input y : UInt<1>
    output z : UInt<1>

    node _z_T = xor(x, y) @[Mt2015_q4a.scala 10:12]
    node _z_T_1 = and(_z_T, x) @[Mt2015_q4a.scala 10:18]
    z <= _z_T_1 @[Mt2015_q4a.scala 10:5]

