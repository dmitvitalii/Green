package me.dmitvitalii.green.model.plant

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity data class Plant(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,
        val roomId: Long,
        val nick: String,
        val irrigated: LocalDateTime,
        val irrigationPeriod: Int,
        val name: String,
        val type: String,
        val soil: String,
        val description: String?,
        val condition: String
)