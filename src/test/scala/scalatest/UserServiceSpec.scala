package scalatest

import org.scalatest.Matchers
import org.scalatest.WordSpec
import org.scalatest.mock.MockitoSugar

import org.mockito.Mockito.{verify, when}

import models._

class UserServiceSpec extends WordSpec with Matchers with MockitoSugar {
  
  "isAdmin" should {
    "be true when the role is admin" in {
      
      val user = User(1, "Johnny Utah")
      
      // Create mock
      val userRepository = mock[UserRepository]
      when(userRepository.roles(user)).thenReturn(Set(Role("ADMIN")))
      
      // Class under test
      val userService = new UserService(userRepository)
      
      // Run test
      userService.isAdmin(user) shouldBe true
      
      // Verify mock behavior
      verify(userRepository).roles(user)
    }
  }
  
}