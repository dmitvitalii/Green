package me.dmitvitalii.green.model.room

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity data class Room(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,
        val parentId: Long?,
        val name: String
)