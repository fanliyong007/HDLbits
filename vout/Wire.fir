;buildInfoPackage: chisel3, version: 3.5-SNAPSHOT, scalaVersion: 2.12.13, sbtVersion: 1.5.2
circuit Wire : 
  module Wire : 
    output io : {flip in : UInt<1>, out : UInt<1>}
    
    io.out <= io.in @[Wire.scala 11:10]
    
