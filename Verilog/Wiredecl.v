module top_module(
    input a,
    input b,
    input c,
    input d,
    output out,
    output out_n   ); 
    wire  tmp_wire;
    assign tmp_wire=(a&b)|(c&d);
    assign out = tmp_wire;
    assign out_n = ~tmp_wire; 
endmodule