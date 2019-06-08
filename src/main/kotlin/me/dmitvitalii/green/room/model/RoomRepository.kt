package me.dmitvitalii.green.room.model

import org.springframework.data.repository.CrudRepository
import java.util.*


interface RoomRepository : CrudRepository<Room, Long> {

    override fun findById(id: Long): Optional<Room>

}