package khw.org.service

import khw.org.dto.UserSaveApiDto
import khw.org.model.User
import khw.org.repository.UserRepository

class UserService(
    val userRepository: UserRepository
) {

    fun createUser(userSaveApiDto: UserSaveApiDto){
        userRepository.createUser(userSaveApiDto)
    }
}