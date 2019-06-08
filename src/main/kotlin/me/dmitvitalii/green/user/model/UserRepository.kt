package me.dmitvitalii.green.user.model

import org.springframework.data.repository.Repository
import org.springframework.data.repository.query.Param

interface UserRepository : Repository<User, Long> {

    fun findById(@Param("id") id: Long): User?

    fun findAllById(@Param("parentId") parentId: Long): Collection<User>

    fun save(element: User): Long

}