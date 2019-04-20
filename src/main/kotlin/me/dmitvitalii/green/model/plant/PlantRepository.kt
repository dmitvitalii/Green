package me.dmitvitalii.green.model.plant

import me.dmitvitalii.green.model.GreenRepository
import org.springframework.data.repository.Repository
import org.springframework.data.repository.query.Param

interface PlantRepository : GreenRepository<Plant, Long>, Repository<Plant, Long> {

    override fun findById(@Param("id") id: Long): Plant?

    override fun findAllById(@Param("parentId") parentId: Long): Collection<Plant>

    override fun save(element: Plant): Long

}