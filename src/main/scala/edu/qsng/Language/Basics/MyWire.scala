package edu.qsng.Language.Basics

import chisel3._
import chisel3.stage.ChiselStage
// 题目主要大意为创建一个模块拥有一个输入一个输出并将输入输出连接起来，
// 需要注意的是在:=语句当中并不是像C语言那种赋值它的功能更像是将
// 两个端口物理意义上的连接起来，时刻要注意我们是在描述硬件逻辑而不是
// 在编写程序。
//package mypack//由于chisel来源于scala而scala又来源于Java，故都是采用了同样的包机制来管理项目
//import chisel3._ //引入chisel必要的类与模块
//class Abc extends Module{
//  val io=IO(new Bundle{})
//}
////当在别的地方想要使用Abc这个类的时候可以这样做
//import mypack._ //下划线表示所有mypack中的类都会被引用
//class AbcUser extends Module{
//  val io=IO(new Bundle{})
//  val abc=new Abc()
//}
////当然也可以不用全部引用而采用（包名 点 类名）的方式来访问
//class AbcUser2 extends Module{
//  val io=IO(new Bundle{})
//  val abc=new mypack.Abc()
//}
////引用单个类也可以在import中直接规定
//import mypack.Abc
//class AbcUser3 extends Module{
//  val io=IO(new Bundle{})
//  val abc=new Abc()
//}
//
//这里我们使用RawModule作为模块的模板而不是Module类是因为Module类比RawModule类在生成Verilog代码的时候
//会多一个clk端口，为了方便提交题目这边直接使用RawModule
class MyWire extends RawModule {
  val io = IO(new Bundle {
    val in = Input(UInt(1.W))
    val out = Output(UInt(1.W))
  })
  io.out := io.in
}

object MyWire extends App{

  (new ChiselStage).emitVerilog(new MyWire,Array("-td","vout"))
}

