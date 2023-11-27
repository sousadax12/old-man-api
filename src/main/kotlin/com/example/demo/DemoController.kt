package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {
    @GetMapping("/hello")
    fun helloWorld(): String {
        return "Welcome, Velhinho"
    }
}
