package com.michaelpippolito.k8s.helloworld.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloWorldController {
    @GetMapping("/")
    fun homepage(model: Model): String {
        model.addAttribute("title", "Hello World")
        model.addAttribute("display_text", "Hello World")

        // this will be the controller for /src/main/resources/templates/hello-world.html
        return "hello-world"
    }
}