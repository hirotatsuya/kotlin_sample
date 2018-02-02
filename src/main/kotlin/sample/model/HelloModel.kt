package sample.model

import com.fasterxml.jackson.annotation.JsonCreator

class HelloModel @JsonCreator constructor (
        var id: Int,
        var text: String
)

