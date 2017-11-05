package com.example.kotlin_sample.model

import com.fasterxml.jackson.annotation.JsonCreator

class HelloModel @JsonCreator constructor (
    var text: Int,
    var id: String
)

