package edu.qsng

import edu.qsng.Circuits.SequentialLogic.MoreCircuits.Rule110
import chisel3._
import chisel3.simulator.EphemeralSimulator.simulate
import chisel3.simulator.PeekPokeAPI.{testableClock, testableData, testableUInt}
import org.scalatest.flatspec.AnyFlatSpec

class Rule110Spec extends AnyFlatSpec {
  behavior of "Rule110"
  it should "do something" in {
    simulate(new Rule110) { c =>
      c.load.poke(true.B)
      c.data.poke("hd0e3706072fb83ba1be26f89a6fbbe26f89be389ba6f89a3387f137c4df130000000000000000000000000000000000000000000000000000000000000000".U)
      c.clock.step()
      c.load.poke(false.B)
      c.clock.step()
      c.q.expect("h313ec71a1fc9b8fba626f89be389ba6f89be26fbe3b89be2df9c37c4df137d0000000000000000000000000000000000000000000000000000000000000000".U)
      println("Last output value : " + c.q.peek().litValue)
    }
  }
}

object Rule110Spec extends App {
  // This is how one can run a ScalaTest Spec manually, typically one would use "sbt test"
  // This is how one can run a ScalaTest Spec manually, typically one would use "sbt test"
  org.scalatest.nocolor.run(new Rule110Spec)
}