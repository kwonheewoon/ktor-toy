package khw.org.repository

import khw.org.dto.UserSaveApiDto
import khw.org.dto.UserUpdateApiDto
import khw.org.model.User
import khw.org.model.Users
import org.jetbrains.exposed.sql.transactions.transaction
import org.jetbrains.exposed.sql.update
import org.jetbrains.exposed.sql.*


class UserRepository {
    fun createUser(userSaveApiDto: UserSaveApiDto) {
        transaction {
//            Users.insert {
//                it[name] = userSaveApiDto.name
//                it[email] = userSaveApiDto.email
//            }
            User.new {
                this.name = userSaveApiDto.name
                this.email = userSaveApiDto.email
            }
        }
    }

    fun updateUser(userId: Long, userUpdateApiDto: UserUpdateApiDto) {
        transaction {
            Users.update({ Users.id eq  userId}) {
                it[name] = userUpdateApiDto.name
                it[email] = userUpdateApiDto.email
            }
        }
    }
}
