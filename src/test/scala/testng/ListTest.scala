package testng

import org.testng.annotations.{BeforeGroups, Test}
import org.testng.Assert._
import org.hamcrest.CoreMatchers._
import org.hamcrest.MatcherAssert.assertThat

class ListTest {

  @Test
  def testIsEmpty = {
    val list = List()
    assertTrue(list.isEmpty, "List should be empty")
  }
  
  @BeforeGroups(Array("sizeTests"))
  def setupSizeTests() {
    println("Setting up for size tests")
  }
  
  @Test(groups = Array("sizeTests"))
  def testSizeOfEmpty = {
    val list = List()
    assertEquals(0, list.size) // basic Assert
  }
  
  @Test(groups = Array("sizeTests"))
  def testSizeOfThree = {
    val list = List(1,2,3)
    assertThat(list.size, is(equalTo(3))) // Using Hamcrest matchers
  }
  
}