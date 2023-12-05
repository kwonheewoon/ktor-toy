package khw.org.plugins

import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting(userRepository: UserRepository) {
    routing {
        post("/users") {
            val user = call.receive<User>()
            userRepository.createUser(user.name, user.email)
            call.respondText("User = $user")
        }
    }
}
