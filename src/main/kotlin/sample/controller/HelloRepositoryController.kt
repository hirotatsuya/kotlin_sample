package sample.controller

import sample.model.HelloModel
import sample.repository.HelloRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/hello/repo")
class HelloRepositoryController {

    @Autowired
    lateinit var helloRepository: HelloRepository

    // /hello/repoというアクセスに対して処理を行う
    @RequestMapping(value = "/{id}", method = arrayOf(RequestMethod.GET))
    fun helloRepo(@PathVariable(value = "id") id: String): MutableList<HelloModel> {
        val toIntId: Int = id.toInt()
        val hello: MutableList<HelloModel> = helloRepository.getHello(toIntId)
        return hello
    }
}
