package me.dmitvitalii.green.model.room

import me.dmitvitalii.green.model.GreenRepository
import org.springframework.data.repository.Repository
import org.springframework.data.repository.query.Param

interface RoomRepository : GreenRepository<Room, Long>, Repository<Room, Long> {

    override fun findById(@Param("id") id: Long): Room?

    override fun findAllById(@Param("parentId") parentId: Long): Collection<Room>

    override fun save(element: Room): Long

}