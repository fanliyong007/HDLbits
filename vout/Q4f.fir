FIRRTL version 1.1.0
circuit Q4f :
  module Q4f :
    input in1 : UInt<1>
    input in2 : UInt<1>
    output out : UInt<1>

    node _out_T = not(in2) @[Q4f.scala 10:17]
    node _out_T_1 = and(in1, _out_T) @[Q4f.scala 10:14]
    out <= _out_T_1 @[Q4f.scala 10:7]

