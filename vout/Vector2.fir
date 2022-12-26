circuit Vector2 :
  module Vector2 :
    output io : { flip in : UInt<32>, out : UInt<32>}

    node _io_out_T = bits(io.in, 7, 0) @[Vector2.scala 18:20]
    io.out <= _io_out_T @[Vector2.scala 18:12]

