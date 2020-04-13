package com.michaelpippolito.k8s.helloworld.controllers

import com.michaelpippolito.k8s.helloworld.users.UsersService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@Controller
class HelloWorldController(private val usersService: UsersService) {
    @GetMapping("/")
    fun homepage(model: Model): String {
        model.addAttribute("title", "Hello World")
        model.addAttribute("display_text", "Hello World")

        // this will be the controller for /src/main/resources/templates/hello-world.html
        return "hello-world"
    }

    @GetMapping("/users/{id}")
    fun users(@PathVariable(value = "id", required = true) id: Int, model: Model): String {
        model.addAttribute("title", id)
        model.addAttribute("users", usersService.getUserById(id))

        return "hello-user"
    }
}