;buildInfoPackage: chisel3, version: 3.5-SNAPSHOT, scalaVersion: 2.12.13, sbtVersion: 1.5.4
circuit Vector2 : 
  module Vector2 : 
    output io : {flip in : UInt<32>, out : UInt<32>}
    
    node io_out_hi_hi = bits(io.in, 7, 0) @[Vector2.scala 12:22]
    node io_out_hi_lo = bits(io.in, 15, 8) @[Vector2.scala 12:33]
    node io_out_lo_hi = bits(io.in, 23, 16) @[Vector2.scala 12:45]
    node io_out_lo_lo = bits(io.in, 31, 24) @[Vector2.scala 12:58]
    node io_out_lo = cat(io_out_lo_hi, io_out_lo_lo) @[Cat.scala 30:58]
    node io_out_hi = cat(io_out_hi_hi, io_out_hi_lo) @[Cat.scala 30:58]
    node _io_out_T = cat(io_out_hi, io_out_lo) @[Cat.scala 30:58]
    io.out <= _io_out_T @[Vector2.scala 12:10]
    
