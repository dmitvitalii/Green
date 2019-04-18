package me.dmitvitalii.green.controller.plants

import me.dmitvitalii.green.model.plants.PlantRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class PlantsRestController(@Autowired val repository: PlantRepository) {


    // TODO: plants in rooms inside buildings
    @GetMapping("/plants")
    fun getPlants(
            @RequestParam(name = "index", required = false) index: Int,
            @RequestParam(name = "number", required = false) number: Int
    ) {

    }

    @GetMapping("/plant/{id}")
    fun getPlant(@PathVariable(name = "id") id: Long) = repository.findById(id)
            ?: throw NoSuchElementException("Cannot find any plant with id $id")
}