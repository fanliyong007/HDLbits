FIRRTL version 1.1.0
circuit Mux2to1v :
  module Mux2to1v :
    input a : UInt<100>
    input b : UInt<100>
    input sel : UInt<1>
    output out : UInt<100>

    node _out_T = mux(sel, b, a) @[Mux2to1v.scala 11:13]
    out <= _out_T @[Mux2to1v.scala 11:7]

