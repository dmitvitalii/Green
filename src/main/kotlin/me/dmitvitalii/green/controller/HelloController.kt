package me.dmitvitalii.green.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloController {
    @GetMapping("/")
    fun page(model: Model): String {
        with(model) {
            addAttribute("title", "Greeting")
            addAttribute("name", "SUPERMAN")
        }
        return "page"
    }
}