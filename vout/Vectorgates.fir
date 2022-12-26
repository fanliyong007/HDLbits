circuit Vectorgates :
  module Vectorgates :
    output io : { flip a : UInt<3>, flip b : UInt<3>, out_or_bitwise : UInt<3>, out_or_logical : UInt<1>, out_not : UInt<6>}

    node _io_out_or_bitwise_T = or(io.a, io.b) @[Vectorgates.scala 14:29]
    io.out_or_bitwise <= _io_out_or_bitwise_T @[Vectorgates.scala 14:21]
    node _io_out_or_logical_T = eq(io.a, UInt<1>("h0")) @[Vectorgates.scala 15:26]
    node _io_out_or_logical_T_1 = eq(io.b, UInt<1>("h0")) @[Vectorgates.scala 15:35]
    node _io_out_or_logical_T_2 = and(_io_out_or_logical_T, _io_out_or_logical_T_1) @[Vectorgates.scala 15:32]
    node _io_out_or_logical_T_3 = eq(_io_out_or_logical_T_2, UInt<1>("h0")) @[Vectorgates.scala 15:24]
    io.out_or_logical <= _io_out_or_logical_T_3 @[Vectorgates.scala 15:21]
    node _io_out_not_T = not(io.b) @[Vectorgates.scala 16:21]
    node _io_out_not_T_1 = not(io.a) @[Vectorgates.scala 16:27]
    node _io_out_not_T_2 = cat(_io_out_not_T, _io_out_not_T_1) @[Cat.scala 33:92]
    io.out_not <= _io_out_not_T_2 @[Vectorgates.scala 16:14]

