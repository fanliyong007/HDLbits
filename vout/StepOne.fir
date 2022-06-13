;buildInfoPackage: chisel3, version: 3.5-SNAPSHOT, scalaVersion: 2.12.13, sbtVersion: 1.5.2
circuit StepOne : 
  module StepOne : 
    input clock : Clock
    input reset : UInt<1>
    output io : {one : UInt<1>}
    
    io.one <= UInt<1>("h01") @[StepOne.scala 10:10]
    
