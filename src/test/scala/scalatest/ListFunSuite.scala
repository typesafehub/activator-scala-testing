package scalatest

import org.scalatest.FunSuite

class ListFunSuite extends FunSuite {
  
  test("An empty List should return true for isEmpty") {
    assert(List().isEmpty)
  }
  
  test("size should return the correct number of elements in a List") {
    assert(List(1, 2, 3).size == 3)
  }
  
  test("Calling head on an empty List should produce NoSuchElementException") {
    intercept[NoSuchElementException] {
      List.empty.head
    }
  }

}