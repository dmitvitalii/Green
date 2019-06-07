package me.dmitvitalii.green.user.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity data class User(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,
        @Column(nullable = false) val roomId: Long,
        @Column(nullable = false) val irrigated: LocalDateTime,
        @Column(nullable = false) val soil: String,
        @Column(nullable = false, length = 50) val nick: String,
        @Column(nullable = false, length = 50) val name: String,
        @Column(nullable = false, length = 30) val type: String
)