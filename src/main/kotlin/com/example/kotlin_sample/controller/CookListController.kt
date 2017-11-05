package com.example.kotlin_sample.controller

import com.example.kotlin_sample.model.CookList
import com.example.kotlin_sample.repository.CookListRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/cooklist")
class CookListController {

    @Autowired
    lateinit var cookListRepository: CookListRepository

    @RequestMapping(method = arrayOf(RequestMethod.GET))
    fun getCookList(): MutableList<CookList> {
        val cookList: MutableList<CookList> = cookListRepository.findAll()
        return cookList
    }

    @RequestMapping(value = "/{id}", method = arrayOf(RequestMethod.GET))
    fun getCookListById(@PathVariable(value = "id") id: String): MutableList<CookList> {
        return cookListRepository.getCookListById(id.toInt())
    }

}
