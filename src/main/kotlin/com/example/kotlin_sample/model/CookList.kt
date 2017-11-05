package com.example.kotlin_sample.model

import com.fasterxml.jackson.annotation.JsonCreator
import kotliquery.Row

data class CookList @JsonCreator constructor (
        val id : Int,
        val orderId : Int,
        val content : String
)
