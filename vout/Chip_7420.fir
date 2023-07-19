FIRRTL version 1.1.0
circuit Chip_7420 :
  module Chip_7420 :
    input p1a : UInt<1>
    input p1b : UInt<1>
    input p1c : UInt<1>
    input p1d : UInt<1>
    output p1y : UInt<1>
    input p2a : UInt<1>
    input p2b : UInt<1>
    input p2c : UInt<1>
    input p2d : UInt<1>
    output p2y : UInt<1>

    node _p1y_T = and(p1a, p1b) @[Chip_7420.scala 17:16]
    node _p1y_T_1 = and(_p1y_T, p1c) @[Chip_7420.scala 17:22]
    node _p1y_T_2 = and(_p1y_T_1, p1d) @[Chip_7420.scala 17:28]
    node _p1y_T_3 = not(_p1y_T_2) @[Chip_7420.scala 17:10]
    p1y <= _p1y_T_3 @[Chip_7420.scala 17:7]
    node _p2y_T = and(p2a, p2b) @[Chip_7420.scala 18:16]
    node _p2y_T_1 = and(_p2y_T, p2c) @[Chip_7420.scala 18:22]
    node _p2y_T_2 = and(_p2y_T_1, p2d) @[Chip_7420.scala 18:28]
    node _p2y_T_3 = not(_p2y_T_2) @[Chip_7420.scala 18:10]
    p2y <= _p2y_T_3 @[Chip_7420.scala 18:7]

