// 题目主要大意为创建一个模块拥有一个输入一个输出并将输入输出连接起来，
// 需要注意的是在assign语句当中并不是像C语言那种赋值它的功能更像是将
// 两个端口物理意义上的连接起来，时刻要注意我们是在描述硬件逻辑而不是
// 在编写程序。
// 在Verilog当中我们的模块主要使用如下格式：
// module moduleName (
// 	ports
// );
// endmodule
// 其中module与endmodule为声明模块的关键字两个关键字之间为模块的具体描述，
// moduleName为模块名，圆弧括号内为输入输出端口声明，如果想要获得更多的知
// 识可以参考夏宇闻教授的《Verilog数字系统设计教程第4版》P26。assign关键字常用于
// 组合逻辑设计，对于组合逻辑概念不理解可以参考杨聪锟老师的《数字电子技术基础》
module top_module( input in, output out );	
	assign out = in;
endmodule