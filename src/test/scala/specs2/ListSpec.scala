package specs2

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ListSpec extends Specification {
  
  "Calling isEmpty" should {
    "return true for a List with 0 elements" in {
      List().isEmpty must beTrue
    }
    "return false for List with > 0 elements" in {
      List(1, 2, 3).isEmpty must beFalse
    }
  }
  
  "Calling size" should {
    "return 3 for a List with 3 elements" in {
      val list = List(1,2,3)
      list.size must beEqualTo(3)
    }
  }
  
  "Calling head" should {
    "throw an exception for an empty List" in {
      List[Int]().head must throwA[NoSuchElementException]
    }
  }
  
}
