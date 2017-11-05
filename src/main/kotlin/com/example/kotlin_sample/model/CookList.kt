package com.example.kotlin_sample.model

import com.fasterxml.jackson.annotation.JsonCreator

class CookList @JsonCreator constructor (
        var id: Int,
        var name: String,
        var recipe_id: Int,
        var setup_id: Int,
        var img_path: String
)

