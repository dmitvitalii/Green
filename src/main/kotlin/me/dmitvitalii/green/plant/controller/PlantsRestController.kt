package me.dmitvitalii.green.plant.controller

import me.dmitvitalii.green.plant.model.Plant
import me.dmitvitalii.green.plant.model.PlantRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class PlantsRestController(val repository: PlantRepository) {

    @ResponseBody
    @GetMapping("plant/{id}")
    fun getPlant(@PathVariable(name = "id") id: Long): ResponseEntity<Plant> {
        val result = repository.findByIdOrNull(id)
        return if (result == null) {
            ResponseEntity.notFound().build<Plant>()
        } else {
            ResponseEntity.ok().body(result)
        }
    }

    @PatchMapping("plant/{id}/_irrigate")
    fun irrigatePlant(
            @PathVariable(name = "id") id: Long,
            @RequestBody plant: Plant
    ) {
        val changePlant = repository.findById(id).get()
        val newPlant = changePlant.copy(
                lastIrrigated = plant.lastIrrigated,
                lastIrrigatedUserId = plant.lastIrrigatedUserId
        )
        repository.deleteById(id)
        repository.save(newPlant)
    }
}