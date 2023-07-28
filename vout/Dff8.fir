FIRRTL version 1.1.0
circuit Dff8 :
  module Dff8 :
    input clock : Clock
    input reset : UInt<1>
    input d : UInt<8>
    output q : UInt<8>

    reg u_reg : UInt<8>, clock with :
      reset => (UInt<1>("h0"), u_reg) @[Dff8.scala 9:18]
    u_reg <= d @[Dff8.scala 10:9]
    q <= u_reg @[Dff8.scala 11:5]

