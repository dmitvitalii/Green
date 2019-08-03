package me.dmitvitalii.green.customer.model

import me.dmitvitalii.green.room.model.Room
import javax.persistence.*

@Entity
data class Customer(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,

        @Column(nullable = false, length = 50)
        val name: String,

        @OneToMany
        val rooms: List<Room>?
)