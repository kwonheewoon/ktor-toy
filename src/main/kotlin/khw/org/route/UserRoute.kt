package khw.org.route

import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import khw.org.dto.UserSaveApiDto
import khw.org.service.UserService

fun Application.userRouting(userService: UserService) {
    routing {
        post("/users") {
            val userSaveApiDto = call.receive<UserSaveApiDto>()
            userService.createUser(userSaveApiDto)
            call.respondText("User = $userSaveApiDto")
        }
    }
}
