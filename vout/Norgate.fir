;buildInfoPackage: chisel3, version: 3.5-SNAPSHOT, scalaVersion: 2.12.13, sbtVersion: 1.5.4
circuit Norgate : 
  module Norgate : 
    output io : {flip a : UInt<1>, flip b : UInt<1>, out : UInt<1>}
    
    node _io_out_T = or(io.a, io.b) @[Norgate.scala 12:19]
    node _io_out_T_1 = not(_io_out_T) @[Norgate.scala 12:13]
    io.out <= _io_out_T_1 @[Norgate.scala 12:10]
    
