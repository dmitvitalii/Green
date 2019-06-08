package me.dmitvitalii.green.user.model

import org.springframework.data.repository.CrudRepository
import java.util.*

interface UserRepository : CrudRepository<User, Long> {

    override fun findById(id: Long): Optional<User>

    fun findAllById(parentId: Long): Collection<User>

    fun save(element: User): Long

}