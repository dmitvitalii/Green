package me.dmitvitalii.green.user.model

import me.dmitvitalii.green.hello.model.GreenRepository
import org.springframework.data.repository.Repository
import org.springframework.data.repository.query.Param

interface UserRepository : GreenRepository<User, Long>, Repository<User, Long> {

    override fun findById(@Param("id") id: Long): User?

    override fun findAllById(@Param("parentId") parentId: Long): Collection<User>

    override fun save(element: User): Long

}