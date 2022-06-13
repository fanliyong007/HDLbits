;buildInfoPackage: chisel3, version: 3.5-SNAPSHOT, scalaVersion: 2.12.13, sbtVersion: 1.5.4
circuit Wiredecl : 
  module Wiredecl : 
    output io : {flip a : UInt<1>, flip b : UInt<1>, flip c : UInt<1>, flip d : UInt<1>, out : UInt<1>, out_d : UInt<1>}
    
    wire tmp_wire : UInt<1> @[Wiredecl.scala 15:20]
    node _tmp_wire_T = and(io.a, io.b) @[Wiredecl.scala 16:20]
    node _tmp_wire_T_1 = and(io.c, io.d) @[Wiredecl.scala 16:32]
    node _tmp_wire_T_2 = or(_tmp_wire_T, _tmp_wire_T_1) @[Wiredecl.scala 16:26]
    tmp_wire <= _tmp_wire_T_2 @[Wiredecl.scala 16:12]
    io.out <= tmp_wire @[Wiredecl.scala 17:10]
    node _io_out_d_T = not(tmp_wire) @[Wiredecl.scala 18:15]
    io.out_d <= _io_out_d_T @[Wiredecl.scala 18:12]
    
