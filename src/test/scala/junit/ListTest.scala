package junit

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.CoreMatchers.is
import org.junit.Assert.assertEquals
import org.junit.Assert.assertThat
import org.junit.Assert.assertTrue
import org.junit.Test

class ListTest {
  
  @Test
  def testIsEmpty = {
    val list = List()
    assertTrue("list should be empty", list.isEmpty)
  }
  
  @Test
  def testSize = {
    val list = List(1,2,3)
    
    // Using basic Assert
    assertEquals(3, list.size)
    
    // Using Hamcrest matchers
    assertThat(list.size, is(equalTo(3)))
  }
  
  @Test(expected = classOf[NoSuchElementException])  
  def testEmptyHead() {  
    List[Int]().head
  } 
  
}