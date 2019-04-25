package me.dmitvitalii.green.controller.room

import me.dmitvitalii.green.model.room.RoomRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class RoomRestController(val repository: RoomRepository) {


    // TODO: plant in rooms inside buildings
    @GetMapping("/rooms")
    fun getRooms(
            @RequestParam(name = "index", required = false) index: Int,
            @RequestParam(name = "number", required = false) number: Int
    ) {

    }

    @GetMapping("/rooms/{id}")
    fun getRoom(@PathVariable(name = "id") id: Long) = repository.findById(id)
            ?: throw NoSuchElementException("Cannot find any rooms with id $id")
}