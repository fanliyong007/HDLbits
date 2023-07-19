FIRRTL version 1.1.0
circuit Gates :
  module Gates :
    input a : UInt<1>
    input b : UInt<1>
    output out_and : UInt<1>
    output out_or : UInt<1>
    output out_xor : UInt<1>
    output out_nand : UInt<1>
    output out_nor : UInt<1>
    output out_xnor : UInt<1>
    output out_anotb : UInt<1>

    node _out_and_T = and(a, b) @[Gates.scala 15:16]
    out_and <= _out_and_T @[Gates.scala 15:11]
    node _out_or_T = or(a, b) @[Gates.scala 16:15]
    out_or <= _out_or_T @[Gates.scala 16:10]
    node _out_xor_T = xor(a, b) @[Gates.scala 17:16]
    out_xor <= _out_xor_T @[Gates.scala 17:11]
    node _out_nand_T = and(a, b) @[Gates.scala 18:19]
    node _out_nand_T_1 = not(_out_nand_T) @[Gates.scala 18:15]
    out_nand <= _out_nand_T_1 @[Gates.scala 18:12]
    node _out_nor_T = or(a, b) @[Gates.scala 19:18]
    node _out_nor_T_1 = not(_out_nor_T) @[Gates.scala 19:14]
    out_nor <= _out_nor_T_1 @[Gates.scala 19:11]
    node _out_xnor_T = xor(a, b) @[Gates.scala 20:19]
    node _out_xnor_T_1 = not(_out_xnor_T) @[Gates.scala 20:15]
    out_xnor <= _out_xnor_T_1 @[Gates.scala 20:12]
    node _out_anotb_T = not(b) @[Gates.scala 21:20]
    node _out_anotb_T_1 = and(a, _out_anotb_T) @[Gates.scala 21:18]
    out_anotb <= _out_anotb_T_1 @[Gates.scala 21:13]

