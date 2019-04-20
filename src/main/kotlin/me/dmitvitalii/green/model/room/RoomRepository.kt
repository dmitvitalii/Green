package me.dmitvitalii.green.model.room

import me.dmitvitalii.green.model.GreenRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface RoomRepository : GreenRepository<Room, Long> {

    override fun findById(@Param("id") id: Long): Room?

    override fun findAllIn(@Param("parentId") parentId: Long): Collection<Room>

    override fun put(element: Room): Long

    override fun remove(@Param("id") id: Long)
}