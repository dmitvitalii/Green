package me.dmitvitalii.green.plant.model

import me.dmitvitalii.green.hello.model.GreenRepository
import org.springframework.data.repository.Repository
import org.springframework.data.repository.query.Param

interface PlantRepository : GreenRepository<Plant, Long>, Repository<Plant, Long> {

    override fun findById(@Param("id") id: Long): Plant?

    override fun findAllById(@Param("parentId") parentId: Long): Collection<Plant>

    override fun save(element: Plant): Long

}