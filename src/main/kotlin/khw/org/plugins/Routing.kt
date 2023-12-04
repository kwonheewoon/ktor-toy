package khw.org.plugins

import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        post("/") {
            val user = call.receive<User>()
            call.respondText("User = $user")
        }
    }
}
