package junit

import org.hamcrest.CoreMatchers.is
import org.junit.Assert.assertThat
import org.junit.Test
import org.mockito.Matchers.any
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify
import org.mockito.Mockito.when

import models.Role
import models.User
import models.UserRepository
import models.UserService

class UserServiceTest {
  
  @Test
  def testIsAdmin() {
    
    val user = User(1, "Johnny Utah")
    
    // Create and train mock
    val userRepository = mock(classOf[UserRepository])
    when(userRepository.roles(user)).thenReturn(Set(Role("ADMIN")))
    
    // Class under test
    val userService = new UserService(userRepository)
    
    // Run test
    assertThat(userService.isAdmin(user), is(true))
    
    // Verify mock behavior
    verify(userRepository).roles(user)
  }

}