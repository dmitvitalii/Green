package me.dmitvitalii.green.customer.model

import org.springframework.data.repository.CrudRepository
import java.util.*

interface CustomerRepository : CrudRepository<Customer, Long> {

    override fun findById(id: Long): Optional<Customer>

    fun findAllById(parentId: Long): Collection<Customer>

    fun save(element: Customer): Long

}