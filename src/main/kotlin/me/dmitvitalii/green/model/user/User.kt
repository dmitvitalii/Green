package me.dmitvitalii.green.model.user

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity data class User(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,
        val roomId: Long,
        val nick: String,
        val irrigated: LocalDateTime,
        val name: String,
        val type: String,
        val soil: String
)