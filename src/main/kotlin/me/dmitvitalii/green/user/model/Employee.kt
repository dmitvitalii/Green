package me.dmitvitalii.green.user.model

import javax.persistence.*

@Entity
class Employee(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,
        @Column(nullable = false, length = 50) val name: String
)