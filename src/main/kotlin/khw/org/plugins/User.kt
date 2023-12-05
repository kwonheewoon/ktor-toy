package khw.org.plugins

import org.jetbrains.exposed.dao.id.IntIdTable
import org.jetbrains.exposed.sql.Column

object Users : IntIdTable() {
    val name: Column<String> = varchar("name", 255)
    val email: Column<String> = varchar("email", 255)
}
data class User(val id: Int, val name: String, val email: String)
