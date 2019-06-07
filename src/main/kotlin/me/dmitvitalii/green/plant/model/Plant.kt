package me.dmitvitalii.green.plant.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity data class Plant(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,
        @Column(nullable = false) val roomId: Long,
        @Column(nullable = false) val nick: String,
        @Column(nullable = false) val irrigated: LocalDateTime,
        @Column(nullable = false) val irrigationPeriod: Int,
        @Column(nullable = false) val name: String,
        @Column(nullable = false) val type: String,
        @Column(nullable = false) val soil: String,
        val description: String?,
        @Column(nullable = false) val condition: String
)