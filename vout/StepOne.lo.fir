circuit StepOne :
  module StepOne :
    input clock : Clock
    input reset : UInt<1>
    output io_one : UInt<1>

    io_one <= UInt<1>("h1") @[StepOne.scala 10:10]
