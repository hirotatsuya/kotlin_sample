package sample.service

import org.springframework.stereotype.Service

@Service
class HelloService {

    fun getHello(): String {
        return "Hello Service"
    }
}
