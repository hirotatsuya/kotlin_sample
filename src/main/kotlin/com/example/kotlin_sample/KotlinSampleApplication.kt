package com.example.kotlin_sample

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinSampleApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinSampleApplication::class.java, *args)
}
