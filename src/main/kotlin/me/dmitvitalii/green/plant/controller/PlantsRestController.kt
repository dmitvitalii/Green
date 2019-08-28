package me.dmitvitalii.green.plant.controller

import me.dmitvitalii.green.plant.model.Plant
import me.dmitvitalii.green.plant.model.PlantRepository
import org.springframework.web.bind.annotation.*

@RestController
class PlantsRestController(val repository: PlantRepository) {

    @ResponseBody
    @GetMapping("/plant/{id}")
    fun getPlant(@PathVariable(name = "id") id: Long) = repository.findById(id).get()

    @PatchMapping("/plant/{id}/irrigate")
    fun irrigatePlant(@PathVariable(name = "id") id: Long, @RequestBody plant: Plant) {
        val changePlant = repository.findById(id).get()
        val newPlant = changePlant.copy(irrigated = plant.irrigated)
        repository.deleteById(id)
        repository.save(newPlant)
    }
}