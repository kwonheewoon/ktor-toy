package khw.org.plugins

import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.transactions.transaction

class UserRepository {
    fun createUser(name: String, email: String) {
        transaction {
            Users.insert {
                it[this.name] = name
                it[this.email] = email
            }
        }
    }
}
