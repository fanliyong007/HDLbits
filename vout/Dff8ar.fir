FIRRTL version 1.1.0
circuit Dff8ar :
  module Dff8ar :
    input clk : Clock
    input areset : UInt<1>
    input d : UInt<8>
    output q : UInt<8>

    node _T = asAsyncReset(areset) @[Dff8ar.scala 12:32]
    reg myReg : UInt<8>, clk with :
      reset => (_T, UInt<1>("h0")) @[Dff8ar.scala 13:26]
    myReg <= d @[Dff8ar.scala 14:13]
    q <= myReg @[Dff8ar.scala 15:9]

