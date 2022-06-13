;buildInfoPackage: chisel3, version: 3.5-SNAPSHOT, scalaVersion: 2.12.13, sbtVersion: 1.5.4
circuit Wire4 : 
  module Wire4 : 
    output io : {flip a : UInt<1>, flip b : UInt<1>, flip c : UInt<1>, w : UInt<1>, x : UInt<1>, y : UInt<1>, z : UInt<1>}
    
    io.w <= io.a @[Wire4.scala 16:7]
    io.x <= io.b @[Wire4.scala 17:7]
    io.y <= io.b @[Wire4.scala 18:7]
    io.z <= io.c @[Wire4.scala 19:7]
    
