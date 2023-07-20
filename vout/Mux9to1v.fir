FIRRTL version 1.1.0
circuit Mux9to1v :
  module Mux9to1v :
    input a : UInt<16>
    input b : UInt<16>
    input c : UInt<16>
    input d : UInt<16>
    input e : UInt<16>
    input f : UInt<16>
    input g : UInt<16>
    input h : UInt<16>
    input i : UInt<16>
    input sel : UInt<4>
    output out : UInt<16>

    node _out_T = eq(sel, UInt<1>("h0")) @[Mux9to1v.scala 20:16]
    node _out_T_1 = eq(sel, UInt<1>("h1")) @[Mux9to1v.scala 21:12]
    node _out_T_2 = eq(sel, UInt<2>("h2")) @[Mux9to1v.scala 22:12]
    node _out_T_3 = eq(sel, UInt<2>("h3")) @[Mux9to1v.scala 23:12]
    node _out_T_4 = eq(sel, UInt<3>("h4")) @[Mux9to1v.scala 24:12]
    node _out_T_5 = eq(sel, UInt<3>("h5")) @[Mux9to1v.scala 25:12]
    node _out_T_6 = eq(sel, UInt<3>("h6")) @[Mux9to1v.scala 26:12]
    node _out_T_7 = eq(sel, UInt<3>("h7")) @[Mux9to1v.scala 27:12]
    node _out_T_8 = eq(sel, UInt<4>("h8")) @[Mux9to1v.scala 28:12]
    node _out_T_9 = mux(_out_T_8, i, UInt<16>("hffff")) @[Mux.scala 139:16]
    node _out_T_10 = mux(_out_T_7, h, _out_T_9) @[Mux.scala 139:16]
    node _out_T_11 = mux(_out_T_6, g, _out_T_10) @[Mux.scala 139:16]
    node _out_T_12 = mux(_out_T_5, f, _out_T_11) @[Mux.scala 139:16]
    node _out_T_13 = mux(_out_T_4, e, _out_T_12) @[Mux.scala 139:16]
    node _out_T_14 = mux(_out_T_3, d, _out_T_13) @[Mux.scala 139:16]
    node _out_T_15 = mux(_out_T_2, c, _out_T_14) @[Mux.scala 139:16]
    node _out_T_16 = mux(_out_T_1, b, _out_T_15) @[Mux.scala 139:16]
    node _out_T_17 = mux(_out_T, a, _out_T_16) @[Mux.scala 139:16]
    out <= _out_T_17 @[Mux9to1v.scala 19:6]

