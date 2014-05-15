package scalatest

import org.scalatest.Matchers
import org.scalatest.WordSpec
import org.scalatest.mock.MockitoSugar
import java.io.File
import org.mockito.Mockito.{verify, when}

class ListWordSpec extends WordSpec with Matchers with MockitoSugar {

  "Calling isEmpty" should {
    "return true for a List with 0 elements" in {
      List().isEmpty shouldBe true
    }
    "return false for List with > 0 elements" in {
      List(1, 2, 3).isEmpty shouldBe false
    }
  }
  
  "Calling size" should {
    "return 3 for a List with 3 elements" in {
      val list = List(1,2,3)
      list.size shouldBe 3
    }
  }
  
  "Calling head" should {
    "throw an exception for an empty List" in {
      intercept[NoSuchElementException] {
        List[Int]().head
      }
    }
  }
  
  "Mocking a List" should {
    "return trained value for head" in {
      
      // Create mock
      val mockList = mock[List[Int]]
      when(mockList.head).thenReturn(1)
      
      // Test
      mockList.head shouldBe 1 // matcher for test value
      verify(mockList).head // Verify mock behavior
    }
  }
  
}