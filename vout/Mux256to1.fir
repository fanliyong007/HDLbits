FIRRTL version 1.1.0
circuit Mux256to1 :
  module Mux256to1 :
    input in : UInt<256>
    input sel : UInt<8>
    output out : UInt<1>

    node _out_T = dshr(in, sel) @[Mux256to1.scala 10:10]
    node _out_T_1 = bits(_out_T, 0, 0) @[Mux256to1.scala 10:10]
    out <= _out_T_1 @[Mux256to1.scala 10:6]

