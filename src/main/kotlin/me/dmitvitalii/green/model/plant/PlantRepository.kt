package me.dmitvitalii.green.model.plant

import me.dmitvitalii.green.model.GreenRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface PlantRepository : GreenRepository<Plant, Long> {

    override fun findById(@Param("id") id: Long): Plant?

    override fun findAllIn(@Param("parentId") parentId: Long): Collection<Plant>

    override fun put(element: Plant): Long

    override fun remove(@Param("id") id: Long)
}