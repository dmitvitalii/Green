package me.dmitvitalii.green.customer.controller

import me.dmitvitalii.green.customer.model.CustomerRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerRestController(val repository: CustomerRepository) {

    // TODO: plant in rooms inside buildings
    @GetMapping("/users")
    fun geUsers(
            @RequestParam(name = "index", required = false) index: Int?,
            @RequestParam(name = "number", required = false) number: Int?
    ) {
        repository.findAll()
    }

    @GetMapping("/users/{id}")
    fun getUser(@PathVariable(name = "id") id: Long) = repository.findById(id).orElseThrow()
}