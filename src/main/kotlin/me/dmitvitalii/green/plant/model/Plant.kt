package me.dmitvitalii.green.plant.model

import me.dmitvitalii.green.room.model.Room
import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class Plant(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,

        @ManyToOne
        @JoinColumn(name = "room_id", nullable = false)
        val room: Room,

        @Column(nullable = false)
        val nick: String,

        @Column(nullable = false)
        val irrigated: LocalDateTime,

        @Column(nullable = false)
        val irrigationPeriod: Int,

        @Column(nullable = false)
        val type: String,

        @Column(nullable = false)
        val soil: String,

        @Column(nullable = true)
        val description: String?,

        @Column(nullable = false)
        val condition: String
)