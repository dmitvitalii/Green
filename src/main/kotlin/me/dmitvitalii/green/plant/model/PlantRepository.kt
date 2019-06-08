package me.dmitvitalii.green.plant.model

import org.springframework.data.repository.CrudRepository
import java.util.*

interface PlantRepository : CrudRepository<Plant, Long> {

    override fun findById(id: Long): Optional<Plant>

    fun findAllById(parentId: Long): Collection<Plant>

    fun save(element: Plant): Long

}