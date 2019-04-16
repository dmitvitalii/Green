package me.dmitvitalii.green.model.plants

import java.time.LocalDateTime

data class Plant(
        val id: Long,
        val nick: String,
        val irrigated: LocalDateTime,
        val name: String,
        val type: String,
        val soil: String
)