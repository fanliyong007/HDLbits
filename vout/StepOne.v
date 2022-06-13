module StepOne(
  input   clock,
  input   reset,
  output  io_one
);
  assign io_one = 1'h1; // @[StepOne.scala 10:10]
endmodule
