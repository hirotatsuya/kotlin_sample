package com.example.kotlin_sample.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class IndexController {
    @RequestMapping(value = "/", method = arrayOf(RequestMethod.GET))
    fun index(): String = "Hello Spring with Kotlin!"
}