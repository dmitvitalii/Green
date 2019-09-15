package me.dmitvitalii.green.room.model

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional
import java.util.*


@Transactional
@Repository
interface RoomRepository : CrudRepository<Room, Long> {
    override fun findById(id: Long): Optional<Room>
}