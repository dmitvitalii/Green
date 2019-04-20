package me.dmitvitalii.green.controller.plant

import me.dmitvitalii.green.model.plant.PlantRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class PlantsRestController(val repository: PlantRepository) {


    // TODO: plant in rooms inside buildings
    @GetMapping("/plants")
    fun getPlants(
            @RequestParam(name = "index", required = false) index: Int?,
            @RequestParam(name = "number", required = false) number: Int?
    ): String {
    }

    @GetMapping("/plant/{id}")
    fun getPlant(@PathVariable(name = "id") id: Long) = repository.findById(id)
            ?: throw NoSuchElementException("Cannot find any plant with id $id")
}