package edu.qsng.Circuits.SequentialLogic.Counters
import chisel3._
import chisel3.util.Cat
import circt.stage.ChiselStage

class Count_clock extends Module with ImplicitClock {

  val clk = IO(Input(Clock()))
  val ena = IO(Input(Bool()))
  val pm  = IO(Output(Bool()))
  val hh = IO(Output(UInt(8.W)))
  val mm = IO(Output(UInt(8.W)))
  val ss = IO(Output(UInt(8.W)))
  override protected def implicitClock = clk
  val p    = RegInit(false.B)
  val hReg = RegInit("h12".U(8.W))
  val mReg = RegInit(0.U(8.W))
  val sReg = RegInit(0.U(8.W))
  when(ena){
    when(sReg<"h59".U){
      when(sReg(3,0)<"h9".U){
        sReg := sReg + 1.U
      }.otherwise{
        sReg := Cat(sReg(7,4)+1.U,0.U(4.W))
      }
    }.otherwise{
      sReg := 0.U
      when(mReg<"h59".U){
        when(mReg(3,0)<"h9".U){
          mReg := mReg + 1.U
        }.otherwise{
          mReg := Cat(mReg(7,4)+1.U,0.U(4.W))
        }
      }.otherwise{
        mReg := 0.U
        when(hReg==="h11".U){
          p := !p
        }
        when(hReg<"h12".U){
          when(hReg(3,0)<"h9".U){
            hReg := hReg + 1.U
          }.otherwise{
            hReg := Cat(hReg(7,4)+1.U,0.U(4.W))
          }
        }.otherwise{
          hReg := 1.U
        }
      }
    }
  }
  pm := p
  hh := hReg
  mm := mReg
  ss := sReg
}

object Count_clock extends App{
  ChiselStage.emitSystemVerilogFile(
    gen = new Count_clock,
    firtoolOpts = Array(
      "-disable-all-randomization",
      "-strip-debug-info")
  )
}


//
//val p = RegInit(false.B) // 0: am, 1: pm
//val h = RegInit("h12".U(8.W))
//val m = RegInit(0.U(8.W))
//val s = RegInit(0.U(8.W))
//
//when(reset.asBool) {
//  p := false.B
//  h := "h12".U
//  m := 0.U
//  s := 0.U
//} .elsewhen(ena) {
//  when(s < "h59".U) {
//    when(s(3, 0) < "h9".U) {
//      s := s + 1.U
//    } .otherwise {
//      s := Cat(s(7, 4) + 1.U, 0.U(4.W))
//    }
//  } .otherwise {
//    s := 0.U
//    when(m < "h59".U) {
//      when(m(3, 0) < "h9".U) {
//        m := m + 1.U
//      } .otherwise {
//        m := Cat(m(7, 4) + 1.U, 0.U(4.W))
//      }
//    } .otherwise {
//      m := 0.U
//      when(h === "h11".U) {
//        p := !p
//      }
//      when(h < "h12".U) {
//        when(h(3, 0) < "h9".U) {
//          h := h + 1.U
//        } .otherwise {
//          h := Cat(h(7, 4) + 1.U, 0.U(4.W))
//        }
//      } .otherwise {
//        h := 1.U
//      }
//    }
//  }
//}
//pm := p
//hh := h
//mm := m
//ss := s