circuit GCD :
  module GCD :
    output io : { flip ina : UInt<32>, flip inb : UInt<32>, out : UInt<64>}

    node _io_out_T = cat(io.ina, io.inb) @[Cat.scala 33:92]
    io.out <= _io_out_T @[GCD.scala 25:10]

