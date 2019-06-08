package me.dmitvitalii.green.customer.model

import javax.persistence.*

@Entity
class Customer(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,
        @Column(nullable = false, length = 50) val name: String
)