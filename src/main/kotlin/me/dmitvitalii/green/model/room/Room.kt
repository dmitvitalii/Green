package me.dmitvitalii.green.model.room

data class Room(
        val id: Long,
        val parentId: Long?,
        val name: String
)