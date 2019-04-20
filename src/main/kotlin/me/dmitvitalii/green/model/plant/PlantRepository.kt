package me.dmitvitalii.green.model.plant

import me.dmitvitalii.green.model.GreenRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface PlantRepository : GreenRepository<Plant, Long> {

    override fun findById(@Param("id") id: Long): Plant?

    override fun findAllById(@Param("parentId") parentId: Long): Collection<Plant>

    override fun save(element: Plant): Long

}