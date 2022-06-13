;buildInfoPackage: chisel3, version: 3.5-SNAPSHOT, scalaVersion: 2.12.13, sbtVersion: 1.5.4
circuit GCD : 
  module GCD : 
    input clock : Clock
    input reset : UInt<1>
    output io : {flip value1 : UInt<16>, flip value2 : UInt<16>, flip loadingValues : UInt<1>, outputGCD : UInt<16>, outputValid : UInt<1>}
    
    reg x : UInt<16>, clock with : (reset => (reset, UInt<16>("h00"))) @[GCD.scala 22:19]
    reg y : UInt<16>, clock with : (reset => (reset, UInt<16>("h00"))) @[GCD.scala 23:19]
    node _T = gt(x, y) @[GCD.scala 25:10]
    when _T : @[GCD.scala 25:15]
      node _x_T = sub(x, y) @[GCD.scala 25:24]
      node _x_T_1 = tail(_x_T, 1) @[GCD.scala 25:24]
      x <= _x_T_1 @[GCD.scala 25:19]
      skip @[GCD.scala 25:15]
    else : @[GCD.scala 26:16]
      node _y_T = sub(y, x) @[GCD.scala 26:25]
      node _y_T_1 = tail(_y_T, 1) @[GCD.scala 26:25]
      y <= _y_T_1 @[GCD.scala 26:20]
      skip @[GCD.scala 26:16]
    when io.loadingValues : @[GCD.scala 28:26]
      x <= io.value1 @[GCD.scala 29:7]
      y <= io.value2 @[GCD.scala 30:7]
      skip @[GCD.scala 28:26]
    io.outputGCD <= x @[GCD.scala 33:16]
    node _io_outputValid_T = eq(y, UInt<1>("h00")) @[GCD.scala 34:23]
    io.outputValid <= _io_outputValid_T @[GCD.scala 34:18]
    
