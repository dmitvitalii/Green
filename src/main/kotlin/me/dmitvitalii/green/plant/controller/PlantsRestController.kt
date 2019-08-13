package me.dmitvitalii.green.plant.controller

import me.dmitvitalii.green.plant.model.PlantRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class PlantsRestController(val repository: PlantRepository) {

    @GetMapping("/plant/{id}")
    fun getPlant(@PathVariable(name = "id") id: Long) = repository.findById(id).get()
}