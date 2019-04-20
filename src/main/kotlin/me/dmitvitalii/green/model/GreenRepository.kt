package me.dmitvitalii.green.model

interface GreenRepository<Type, ID> {

    fun findById(id: Long): Type?

    fun findAllById(parentId: ID): Collection<Type>

    fun save(element: Type):ID

}