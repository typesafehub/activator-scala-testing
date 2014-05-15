package models

case class User(id: Int, name: String)

case class Role(name: String)

trait UserRepository {
  def roles(user:User) : Set[Role]
}

class UserService(userRepository : UserRepository) {
  def isAdmin(user:User) : Boolean = {
    userRepository.roles(user).contains(Role("ADMIN"))
  }
}