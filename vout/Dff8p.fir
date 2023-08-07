FIRRTL version 1.1.0
circuit Dff8p :
  module Dff8p :
    input clock : Clock
    input reset : UInt<1>
    input d : UInt<8>
    output q : UInt<8>

    reg u_reg : UInt<8>, clock with :
      reset => (reset, UInt<1>("h1")) @[Dff8p.scala 9:22]
    u_reg <= d @[Dff8p.scala 10:9]
    q <= u_reg @[Dff8p.scala 11:5]

