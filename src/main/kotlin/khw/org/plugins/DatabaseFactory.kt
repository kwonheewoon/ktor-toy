package khw.org.plugins

import khw.org.model.Users
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction

object DatabaseFactory {
    fun init() {
        Database.connect(
            url = "jdbc:mysql://localhost:3306/ktor",
            driver = "com.mysql.cj.jdbc.Driver",
            user = "root",
            password = "1234"
        )


        transaction {
            SchemaUtils.drop(Users)
            SchemaUtils.create(Users)
        }

    }
}