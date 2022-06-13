;buildInfoPackage: chisel3, version: 3.5-SNAPSHOT, scalaVersion: 2.12.13, sbtVersion: 1.5.4
circuit Vector1 : 
  module Vector1 : 
    output io : {flip in : UInt<16>, out_hi : UInt<8>, out_lo : UInt<8>}
    
    node _io_out_hi_T = bits(io.in, 15, 8) @[Vector1.scala 12:21]
    io.out_hi <= _io_out_hi_T @[Vector1.scala 12:13]
    node _io_out_lo_T = bits(io.in, 7, 0) @[Vector1.scala 13:21]
    io.out_lo <= _io_out_lo_T @[Vector1.scala 13:13]
    
