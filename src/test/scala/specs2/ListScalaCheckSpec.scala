package specs2

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner
import org.specs2.ScalaCheck

@RunWith(classOf[JUnitRunner])
class ListScalaCheckSpec extends Specification with ScalaCheck {
  
  "Concat of 2 Lists should have correct size" ! prop { (a: List[Int], b: List[Int]) => a.size + b.size == (a ::: b).size}
  
}
