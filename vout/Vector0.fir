circuit Vector0 :
  module Vector0 :
    output io : { flip vec : UInt<3>, outv : UInt<3>, o2 : UInt<1>, o1 : UInt<1>, o0 : UInt<1>}

    io.outv <= io.vec @[Vector0.scala 14:10]
    node _io_o2_T = bits(io.vec, 2, 2) @[Vector0.scala 15:16]
    io.o2 <= _io_o2_T @[Vector0.scala 15:8]
    node _io_o1_T = bits(io.vec, 1, 1) @[Vector0.scala 16:16]
    io.o1 <= _io_o1_T @[Vector0.scala 16:8]
    node _io_o0_T = bits(io.vec, 0, 0) @[Vector0.scala 17:16]
    io.o0 <= _io_o0_T @[Vector0.scala 17:8]

