package me.dmitvitalii.green.controller

import org.springframework.data.repository.Repository

interface GreenRepository<Type, ID> : Repository<Type, ID> {

    fun findById(id: Long): Type?

    fun findAllIn(parentId: ID): Collection<Type>

    fun put(element: Type):ID

    fun remove(id: Long)
}