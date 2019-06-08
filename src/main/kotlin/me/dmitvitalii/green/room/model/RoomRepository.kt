package me.dmitvitalii.green.room.model

import org.springframework.data.repository.Repository
import org.springframework.data.repository.query.Param

interface RoomRepository : Repository<Room, Long> {

    fun findById(@Param("id") id: Long): Room?

    fun findAllById(@Param("parentId") parentId: Long): Collection<Room>

    fun save(element: Room): Long

}