package com.inflames.plugins

import com.inflames.routes.allTeams
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.http.content.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*

fun Application.configureRouting() {


    routing {
        allTeams()

        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
