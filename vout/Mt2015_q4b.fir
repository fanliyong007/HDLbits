FIRRTL version 1.1.0
circuit Mt2015_q4b :
  module Mt2015_q4b :
    input x : UInt<1>
    input y : UInt<1>
    output z : UInt<1>

    node _z_T = xor(x, y) @[Mt2015_q4b.scala 10:13]
    node _z_T_1 = not(_z_T) @[Mt2015_q4b.scala 10:8]
    z <= _z_T_1 @[Mt2015_q4b.scala 10:5]

