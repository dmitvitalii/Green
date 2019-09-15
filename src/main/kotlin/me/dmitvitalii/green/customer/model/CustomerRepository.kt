package me.dmitvitalii.green.customer.model

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Transactional
@Repository
interface CustomerRepository : CrudRepository<Customer, Long> {
    override fun findById(id: Long): Optional<Customer>

    fun findAllById(parentId: Long): Collection<Customer>

    fun save(element: Customer): Long
}