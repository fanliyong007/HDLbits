package edu.qsng.Circuits.SequentialLogic.ShiftRegisters
import chisel3._
import chisel3.util.{Cat, Fill, is, switch}
import circt.stage.ChiselStage
//构建一个64位的算术移位寄存器，具有同步加载功能。移位寄存器可以向左和向右移位，并且可以按1位或8位移位，由`amount`选择。
//算术右移会将移位寄存器中的符号位（在本例中为`q[63]`）移入，而不是像逻辑右移那样移入零。
//另一种理解算术右移的方法是，它假设被移位的数是有符号数，并保留符号，因此算术右移相当于将一个有符号数除以2的幂。
//逻辑左移和算术左移之间没有区别。
//- `load`：加载移位寄存器的数据`data[63:0]`，而不是进行移位。
//- `ena`：选择是否进行移位。
//- `amount`：选择移位的方向和移位的位数。
//- `2'b00`：左移1位。
//- `2'b01`：左移8位。
//- `2'b10`：右移1位。
//- `2'b11`：右移8位。
//- `q`：移位寄存器的内容。
class Shift18 extends Module with ImplicitClock {
  val clk  = IO(Input(Clock()))
  val load = IO(Input(Bool()))
  val ena  = IO(Input(Bool()))
  val amount = IO(Input(UInt(2.W)))
  val data = IO(Input(UInt(64.W)))
  val q = IO(Output(UInt(64.W)))
  override protected def implicitClock = clk
  val qReg = Reg(UInt(64.W))
  when(load){
    qReg := data
  }.elsewhen(ena){
    switch(amount){
      is("b00".U){
        qReg := qReg << 1
      }
      is("b01".U){
        qReg := qReg << 8
      }
      is("b10".U){
        qReg := Cat(qReg(63),qReg(63,1))
      }
      is("b11".U){
        qReg := Cat(Fill(8,qReg(63)),qReg(63,8))
      }
    }
  }
  q := qReg

}
object Shift18 extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new Shift18,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}

