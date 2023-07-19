FIRRTL version 1.1.0
circuit Popcount3 :
  module Popcount3 :
    input in : UInt<3>
    output out : UInt<2>

    node _out_T = bits(in, 0, 0) @[Bitwise.scala 53:100]
    node _out_T_1 = bits(in, 1, 1) @[Bitwise.scala 53:100]
    node _out_T_2 = bits(in, 2, 2) @[Bitwise.scala 53:100]
    node _out_T_3 = add(_out_T_1, _out_T_2) @[Bitwise.scala 51:90]
    node _out_T_4 = bits(_out_T_3, 1, 0) @[Bitwise.scala 51:90]
    node _out_T_5 = add(_out_T, _out_T_4) @[Bitwise.scala 51:90]
    node _out_T_6 = bits(_out_T_5, 1, 0) @[Bitwise.scala 51:90]
    out <= _out_T_6 @[Popcount3.scala 10:7]

