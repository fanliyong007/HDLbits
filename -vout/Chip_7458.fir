;buildInfoPackage: chisel3, version: 3.5-SNAPSHOT, scalaVersion: 2.12.13, sbtVersion: 1.5.4
circuit Chip_7458 : 
  module Chip_7458 : 
    output io : {flip p1a : UInt<1>, flip p1b : UInt<1>, flip p1c : UInt<1>, flip p1d : UInt<1>, flip p1e : UInt<1>, flip p1f : UInt<1>, p1y : UInt<1>, flip p2a : UInt<1>, flip p2b : UInt<1>, flip p2c : UInt<1>, flip p2d : UInt<1>, p2y : UInt<1>}
    
    node _io_p1y_T = and(io.p1a, io.p1b) @[Chip_7458.scala 22:20]
    node _io_p1y_T_1 = and(_io_p1y_T, io.p1c) @[Chip_7458.scala 22:27]
    node _io_p1y_T_2 = and(io.p1d, io.p1e) @[Chip_7458.scala 22:43]
    node _io_p1y_T_3 = and(_io_p1y_T_2, io.p1f) @[Chip_7458.scala 22:50]
    node _io_p1y_T_4 = or(_io_p1y_T_1, _io_p1y_T_3) @[Chip_7458.scala 22:35]
    io.p1y <= _io_p1y_T_4 @[Chip_7458.scala 22:10]
    node _io_p2y_T = and(io.p2a, io.p2b) @[Chip_7458.scala 23:20]
    node _io_p2y_T_1 = and(io.p2c, io.p2d) @[Chip_7458.scala 23:36]
    node _io_p2y_T_2 = or(_io_p2y_T, _io_p2y_T_1) @[Chip_7458.scala 23:28]
    io.p2y <= _io_p2y_T_2 @[Chip_7458.scala 23:10]
    
