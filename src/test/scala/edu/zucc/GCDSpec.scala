//// See README.md for license details.
//
//package edu.zucc
//
//import chisel3._
//import chisel3.tester._
//import org.scalatest.freespec.AnyFreeSpec
//import chisel3.experimental.BundleLiterals._
//
///**
//  * This is a trivial example of how to run this Specification
//  * From within sbt use:
//  * {{{
//  * testOnly edu.zucc.GCDSpec
//  * }}}
//  * From a terminal shell use:
//  * {{{
//  * sbt 'testOnly edu.zucc.GCDSpec'
//  * }}}
//  */
//class GCDSpec extends AnyFreeSpec with ChiselScalatestTester {
//
//  /**
//   * compute the gcd and the number of steps it should take to do it
//   *
//   * @param a positive integer
//   * @param b positive integer
//   * @return the GCD of a and b
//   */
//  def computeGcd(a: Int, b: Int): (Int, Int) = {
//    var x = a
//    var y = b
//    var depth = 1
//    while(y > 0 ) {
//      if (x > y) {
//        x -= y
//      }
//      else {
//        y -= x
//      }
//      depth += 1
//    }
//    (x, depth)
//  }
//
//  "GCD should calculate proper greatest common denominator" in {
//    test(new GCD) { dut =>
//      for(i <- 1 to 40 by 3) {
//        for (j <- 1 to 40 by 7) {
//          dut.io.value1.poke(i.U)
//          dut.io.value2.poke(j.U)
//          dut.io.loadingValues.poke(1.B)
//          dut.clock.step()
//
//          dut.io.loadingValues.poke(0.B)
//
//          val (expected_gcd, steps) = computeGcd(i, j)
//
//          dut.clock.step(steps - 1) // -1 is because we step(1) already to toggle the enable
//          dut.io.outputGCD.expect(expected_gcd.U)
//          dut.io.outputValid.expect(1.B)
//        }
//      }
//    }
//  }
//
//  "DecoupledGcd should calculate proper greatest common denominator" in {
//    test(new DecoupledGcd(16)) { dut =>
//      dut.input.initSource()
//      dut.input.setSourceClock(dut.clock)
//      dut.output.initSink()
//      dut.output.setSinkClock(dut.clock)
//
//      val testValues = for { x <- 0 to 10; y <- 0 to 10} yield (x, y)
//      val inputSeq = testValues.map { case (x, y) => (new GcdInputBundle(16)).Lit(_.value1 -> x.U, _.value2 -> y.U) }
//      val resultSeq = testValues.map { case (x, y) =>
//        (new GcdOutputBundle(16)).Lit(_.value1 -> x.U, _.value2 -> y.U, _.gcd -> BigInt(x).gcd(BigInt(y)).U)
//      }
//
//      fork {
//        // push inputs into the calculator, stall for 11 cycles one third of the way
//        val (seq1, seq2) = inputSeq.splitAt(resultSeq.length / 3)
//        dut.input.enqueueSeq(seq1)
//        dut.clock.step(11)
//        dut.input.enqueueSeq(seq2)
//      }.fork {
//        // retrieve computations from the calculator, stall for 10 cycles one half of the way
//        val (seq1, seq2) = resultSeq.splitAt(resultSeq.length / 2)
//        dut.output.expectDequeueSeq(seq1)
//        dut.clock.step(10)
//        dut.output.expectDequeueSeq(seq2)
//      }.join()
//
//    }
//  }
//}
