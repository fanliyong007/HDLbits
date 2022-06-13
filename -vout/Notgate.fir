;buildInfoPackage: chisel3, version: 3.5-SNAPSHOT, scalaVersion: 2.12.13, sbtVersion: 1.5.4
circuit Notgate : 
  module Notgate : 
    output io : {flip in : UInt<1>, out : UInt<1>}
    
    node _io_out_T = not(io.in) @[Notgate.scala 11:13]
    io.out <= _io_out_T @[Notgate.scala 11:10]
    
