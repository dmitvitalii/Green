package me.dmitvitalii.green.plant.model

import org.springframework.data.repository.Repository
import org.springframework.data.repository.query.Param

interface PlantRepository : Repository<Plant, Long> {

    fun findById(@Param("id") id: Long): Plant?

    fun findAllById(@Param("parentId") parentId: Long): Collection<Plant>

    fun save(element: Plant): Long

}