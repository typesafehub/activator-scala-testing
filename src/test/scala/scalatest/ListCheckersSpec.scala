package scalatest

import org.scalacheck.Arbitrary.arbContainer
import org.scalacheck.Prop.propBoolean
import org.scalatest.FunSuite
import org.scalatest.prop.Checkers

class ListCheckersSpec extends FunSuite with Checkers {

  test("Concat of 2 Lists should have a size equal to the sum of sizes") {
    check((a: List[Int], b: List[Int]) => a.size + b.size == (a ::: b).size)
  }
}