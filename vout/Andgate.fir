;buildInfoPackage: chisel3, version: 3.5-SNAPSHOT, scalaVersion: 2.12.13, sbtVersion: 1.5.4
circuit Andgate : 
  module Andgate : 
    output io : {flip a : UInt<1>, flip b : UInt<1>, out : UInt<1>}
    
    node _io_out_T = and(io.a, io.b) @[Andgate.scala 12:17]
    io.out <= _io_out_T @[Andgate.scala 12:10]
    
