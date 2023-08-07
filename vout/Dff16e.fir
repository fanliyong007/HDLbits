FIRRTL version 1.1.0
circuit Dff16e :
  module Dff16e :
    input clk : Clock
    input resetn : UInt<1>
    input byteena : UInt<2>
    input d : UInt<16>
    output q : UInt<16>

    node _T = not(resetn) @[Dff16e.scala 14:26]
    node _T_1 = bits(_T, 0, 0) @[Dff16e.scala 14:35]
    reg myReg : UInt<16>, clk with :
      reset => (_T_1, UInt<1>("h0")) @[Dff16e.scala 15:24]
    q <= myReg @[Dff16e.scala 16:7]
    node _T_2 = eq(byteena, UInt<1>("h0")) @[Dff16e.scala 17:18]
    when _T_2 : @[Dff16e.scala 17:30]
      myReg <= q @[Dff16e.scala 18:13]
    else :
      node _T_3 = eq(byteena, UInt<1>("h1")) @[Dff16e.scala 19:24]
      when _T_3 : @[Dff16e.scala 19:36]
        node _myReg_T = bits(q, 15, 8) @[Dff16e.scala 20:21]
        node _myReg_T_1 = bits(d, 7, 0) @[Dff16e.scala 20:30]
        node _myReg_T_2 = cat(_myReg_T, _myReg_T_1) @[Cat.scala 33:92]
        myReg <= _myReg_T_2 @[Dff16e.scala 20:13]
      else :
        node _T_4 = eq(byteena, UInt<2>("h2")) @[Dff16e.scala 21:24]
        when _T_4 : @[Dff16e.scala 21:36]
          node _myReg_T_3 = bits(d, 15, 8) @[Dff16e.scala 22:21]
          node _myReg_T_4 = bits(q, 7, 0) @[Dff16e.scala 22:30]
          node _myReg_T_5 = cat(_myReg_T_3, _myReg_T_4) @[Cat.scala 33:92]
          myReg <= _myReg_T_5 @[Dff16e.scala 22:13]
        else :
          myReg <= d @[Dff16e.scala 24:13]


