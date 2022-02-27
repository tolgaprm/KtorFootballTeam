package com.inflames.data.model

import kotlinx.serialization.Serializable

@Serializable
data class FootballTeam(
    val teamId: String,
    val name: String,
    val coachName: String,
    val imageUrl: String
)