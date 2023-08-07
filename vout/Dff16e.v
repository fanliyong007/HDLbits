module Dff16e(
  input         clk,
  input         resetn,
  input  [1:0]  byteena,
  input  [15:0] d,
  output [15:0] q
);
`ifdef RANDOMIZE_REG_INIT
  reg [31:0] _RAND_0;
`endif // RANDOMIZE_REG_INIT
  wire  _T = ~resetn; // @[Dff16e.scala 14:26]
  reg [15:0] myReg; // @[Dff16e.scala 15:24]
  wire [15:0] _myReg_T_2 = {q[15:8],d[7:0]}; // @[Cat.scala 33:92]
  wire [15:0] _myReg_T_5 = {d[15:8],q[7:0]}; // @[Cat.scala 33:92]
  assign q = myReg; // @[Dff16e.scala 16:7]
  always @(posedge clk) begin
    if (_T) begin // @[Dff16e.scala 15:24]
      myReg <= 16'h0; // @[Dff16e.scala 15:24]
    end else if (byteena == 2'h0) begin // @[Dff16e.scala 17:30]
      myReg <= q; // @[Dff16e.scala 18:13]
    end else if (byteena == 2'h1) begin // @[Dff16e.scala 19:36]
      myReg <= _myReg_T_2; // @[Dff16e.scala 20:13]
    end else if (byteena == 2'h2) begin // @[Dff16e.scala 21:36]
      myReg <= _myReg_T_5; // @[Dff16e.scala 22:13]
    end else begin
      myReg <= d; // @[Dff16e.scala 24:13]
    end
  end
endmodule
