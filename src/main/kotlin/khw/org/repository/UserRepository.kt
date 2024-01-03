package khw.org.repository

import khw.org.dto.UserSaveApiDto
import khw.org.model.User
import khw.org.model.Users
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.transactions.transaction

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
}
