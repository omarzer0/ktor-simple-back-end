package az.zero.plugins

import az.zero.routes.randomRabbit
import io.ktor.application.*
import io.ktor.http.content.*
import io.ktor.routing.*

fun Application.configureRouting() {

    routing {
        randomRabbit()

        static {
            resources("static")
        }
    }
}
