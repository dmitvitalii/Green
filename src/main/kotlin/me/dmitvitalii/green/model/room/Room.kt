package me.dmitvitalii.green.model.room

import javax.persistence.*

@Entity data class Room(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,
        @Column(nullable = false)
        val name: String,
        val parentId: Long?,
        val childId: Long?
)