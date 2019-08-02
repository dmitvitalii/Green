package me.dmitvitalii.green.room.model

import me.dmitvitalii.green.customer.model.Customer
import javax.persistence.*

@Entity
data class Room(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,
        @Column(nullable = false)
        val name: String,
        val parentId: Long?,
        val childId: Long?,
        val adminId: Customer?
)