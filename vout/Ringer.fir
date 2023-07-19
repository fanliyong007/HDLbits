FIRRTL version 1.1.0
circuit Ringer :
  module Ringer :
    input ring : UInt<1>
    input vibrate_mode : UInt<1>
    output ringer : UInt<1>
    output motor : UInt<1>

    node _motor_T = and(ring, vibrate_mode) @[Ringer.scala 11:17]
    motor <= _motor_T @[Ringer.scala 11:9]
    node _ringer_T = not(vibrate_mode) @[Ringer.scala 12:20]
    node _ringer_T_1 = and(ring, _ringer_T) @[Ringer.scala 12:18]
    ringer <= _ringer_T_1 @[Ringer.scala 12:10]

