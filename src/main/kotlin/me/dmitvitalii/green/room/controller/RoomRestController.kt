package me.dmitvitalii.green.room.controller

import me.dmitvitalii.green.room.model.Room
import me.dmitvitalii.green.room.model.RoomRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class RoomRestController(val repository: RoomRepository) {

    @GetMapping("/rooms")
    fun getRooms(): MutableIterable<Room> = repository.findAll()

    @GetMapping("/room/{id}")
    fun getRoom(@PathVariable(name = "id") id: Long) = repository.findById(id).get()

    @GetMapping("/room/{id}/plants")
    fun getPlants(
            @PathVariable(name = "id") id: Long,
            @RequestParam(name = "index", required = false) index: Int?,
            @RequestParam(name = "number", required = false) number: Int?
    ) {
        repository.findAll()
    }
}