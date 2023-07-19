FIRRTL version 1.1.0
circuit Mt2015_eq2 :
  module Mt2015_eq2 :
    input A : UInt<2>
    input B : UInt<2>
    output z : UInt<1>

    node _T = eq(A, B) @[Mt2015_eq2.scala 11:10]
    when _T : @[Mt2015_eq2.scala 11:16]
      z <= UInt<1>("h1") @[Mt2015_eq2.scala 12:6]
    else :
      z <= UInt<1>("h0") @[Mt2015_eq2.scala 14:6]


