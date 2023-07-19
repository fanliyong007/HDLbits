FIRRTL version 1.1.0
circuit Q4e :
  module Q4e :
    input in1 : UInt<1>
    input in2 : UInt<1>
    output out : UInt<1>

    node _out_T = or(in1, in2) @[Q4e.scala 10:16]
    node _out_T_1 = not(_out_T) @[Q4e.scala 10:10]
    out <= _out_T_1 @[Q4e.scala 10:7]

