FIRRTL version 1.1.0
circuit Q4g :
  module Q4g :
    input in1 : UInt<1>
    input in2 : UInt<1>
    input in3 : UInt<1>
    output out : UInt<1>

    node _out_T = xor(in1, in2) @[Q4g.scala 11:17]
    node _out_T_1 = not(_out_T) @[Q4g.scala 11:11]
    node _out_T_2 = xor(_out_T_1, in3) @[Q4g.scala 11:25]
    out <= _out_T_2 @[Q4g.scala 11:7]

