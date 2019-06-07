package me.dmitvitalii.green.room.model

import me.dmitvitalii.green.hello.model.GreenRepository
import org.springframework.data.repository.Repository
import org.springframework.data.repository.query.Param

interface RoomRepository : GreenRepository<Room, Long>, Repository<Room, Long> {

    override fun findById(@Param("id") id: Long): Room?

    override fun findAllById(@Param("parentId") parentId: Long): Collection<Room>

    override fun save(element: Room): Long

}