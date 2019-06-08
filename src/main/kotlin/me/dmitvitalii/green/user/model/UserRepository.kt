package me.dmitvitalii.green.user.model

import org.springframework.data.repository.CrudRepository
import java.util.*

interface UserRepository : CrudRepository<Employee, Long> {

    override fun findById(id: Long): Optional<Employee>

    fun findAllById(parentId: Long): Collection<Employee>

    fun save(element: Employee): Long

}