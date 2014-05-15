package specs2

import org.junit.runner._
import org.specs2.mock.Mockito
import org.specs2.mutable._
import org.specs2.runner._

import models.Role
import models.User
import models.UserRepository
import models.UserService

@RunWith(classOf[JUnitRunner])
class UserServiceSpec extends Specification with Mockito {
  
  "isAdmin" should {
    "be true when the role is admin" in {
      
      val user = User(1, "Johnny Utah")
      
      // Create mock
      val userRepository = mock[UserRepository]
      userRepository.roles(user) returns Set(Role("ADMIN"))

      // Class under test
      val userService = new UserService(userRepository)
      
      // Run test
      userService.isAdmin(user) must beTrue
      
      // Verify mock behavior
      there was one(userRepository).roles(user)
    }
  }

}