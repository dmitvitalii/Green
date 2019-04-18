package me.dmitvitalii.green.model.plants

import me.dmitvitalii.green.controller.GreenRepository
import org.springframework.data.repository.query.Param

interface PlantRepository : GreenRepository<Plant, Long> {

    override fun findById(@Param("id") id: Long): Plant?

    override fun findAllIn(@Param("parentId") parentId: Long): Collection<Plant>

    override fun put(element: Plant): Long

    override fun remove(@Param("id") id: Long)
}