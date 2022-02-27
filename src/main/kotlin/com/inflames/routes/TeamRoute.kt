package com.inflames.routes

import com.inflames.data.model.FootballTeam
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*


// 10.0.2.2 test for Android emulator
// if you test your phone or actual device put in your local ip address instead of 10.0.2.2
private const val BASE_URl = "http://10.0.2.2:8080"

private val teams = listOf(
    FootballTeam("1", "Beşiktaş", "Önder Karaveli", "$BASE_URl/teamlogo/besiktas.png"),
    FootballTeam("2", "Fenerbahçe", "İsmail Kartal", "$BASE_URl/teamlogo/fenerbahce.png"),
    FootballTeam("3", "Liverpool", "Jürgen Klopp", "$BASE_URl/teamlogo/liverpool.png"),
    FootballTeam("4", "Galatasaray", "Domènec Torrent", "$BASE_URl/teamlogo/galatasaray.png"),
    FootballTeam("5", "Manchester City FC", "Pep Guardiola", "$BASE_URl/teamlogo/manch_city.png"),
    FootballTeam("6", "Real Madrid", "Carlo Ancelotti", "$BASE_URl/teamlogo/real_madrid.png"),
    FootballTeam("7", "Trabzonspor", "Abdullah Avcı", "$BASE_URl/teamlogo/trabzon.png")
)

fun Route.allTeams() {

    get("/") {
        call.respond(
            HttpStatusCode.OK,
            teams
        )


    }
}