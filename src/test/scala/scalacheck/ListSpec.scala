package scalacheck

import org.scalacheck.Properties
import org.scalacheck.Prop.{forAll, BooleanOperators}
import org.scalacheck.Prop.propBoolean

object ListSpec extends Properties("List") {

  property("concat") = forAll { (a: List[Int], b: List[Int]) =>
    a.size + b.size == (a ::: b).size
  }
  
  property("head") = forAll { (a: Int) =>
    (a >= 0 && a < 10000) ==> (List(a).head  == a)
  }

}