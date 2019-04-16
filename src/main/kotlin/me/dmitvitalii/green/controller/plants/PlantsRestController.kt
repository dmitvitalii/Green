package me.dmitvitalii.green.controller.plants

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class PlantsRestController {

    // TODO: plants in rooms inside buildings
    @GetMapping("/plants")
    fun getPlants(
            @RequestParam(name = "index", required = false) index: Int,
            @RequestParam(name = "number", required = false) number: Int
    ) {

    }
}