package me.dmitvitalii.green.room.model

import me.dmitvitalii.green.customer.model.Customer
import me.dmitvitalii.green.plant.model.Plant
import javax.persistence.*

@Entity
@Table(name = "rooms")
data class Room(

        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,

        @Column(nullable = false)
        val name: String,

        val parentId: Long?,

        val childId: Long?,

        @ManyToOne
        @JoinColumn(name = "customer_id")
        val admin: Customer?,

        @OneToMany
        val plants: List<Plant>?
)