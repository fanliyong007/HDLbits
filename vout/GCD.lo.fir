circuit GCD :
  module GCD :
    input clock : Clock
    input reset : UInt<1>
    input io_value1 : UInt<16>
    input io_value2 : UInt<16>
    input io_loadingValues : UInt<1>
    output io_outputGCD : UInt<16>
    output io_outputValid : UInt<1>

    reg x : UInt<16>, clock with :
      reset => (UInt<1>("h0"), x) @[GCD.scala 22:19]
    reg y : UInt<16>, clock with :
      reset => (UInt<1>("h0"), y) @[GCD.scala 23:19]
    node _T = gt(x, y) @[GCD.scala 25:10]
    node _x_T = sub(x, y) @[GCD.scala 25:24]
    node _x_T_1 = tail(_x_T, 1) @[GCD.scala 25:24]
    node _y_T = sub(y, x) @[GCD.scala 26:25]
    node _y_T_1 = tail(_y_T, 1) @[GCD.scala 26:25]
    node _GEN_0 = mux(_T, _x_T_1, x) @[GCD.scala 25:15 22:19 25:19]
    node _GEN_1 = mux(_T, y, _y_T_1) @[GCD.scala 25:15 23:19 26:20]
    node _GEN_2 = mux(io_loadingValues, io_value1, _GEN_0) @[GCD.scala 28:26 29:7]
    node _GEN_3 = mux(io_loadingValues, io_value2, _GEN_1) @[GCD.scala 28:26 30:7]
    io_outputGCD <= x @[GCD.scala 33:16]
    io_outputValid <= eq(y, UInt<16>("h0")) @[GCD.scala 34:23]
    x <= mux(reset, UInt<16>("h0"), _GEN_2) @[GCD.scala 22:{19,19}]
    y <= mux(reset, UInt<16>("h0"), _GEN_3) @[GCD.scala 23:{19,19}]
