;buildInfoPackage: chisel3, version: 3.5-SNAPSHOT, scalaVersion: 2.12.13, sbtVersion: 1.5.2
circuit Zero : 
  module Zero : 
    input clock : Clock
    input reset : UInt<1>
    output io : {zero : UInt<1>}
    
    io.zero <= UInt<1>("h00") @[Zero.scala 10:11]
    
