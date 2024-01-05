package khw.org.service

import khw.org.dto.UserSaveApiDto
import khw.org.dto.UserUpdateApiDto
import khw.org.model.User
import khw.org.repository.UserRepository

class UserService(
    val userRepository: UserRepository
) {

    fun createUser(userSaveApiDto: UserSaveApiDto){
        userRepository.createUser(userSaveApiDto)
    }

    fun updateUser(userId: Long, userUpdateApiDto: UserUpdateApiDto){
        userRepository.updateUser(userId, userUpdateApiDto)
    }
}