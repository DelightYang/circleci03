package com.learn.circleci03.controllers

import org.springframework.context.annotation.Bean
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {

    @GetMapping("/hello")
    fun sayHello(): String {
        return "Hello CircleCi"
    }
}