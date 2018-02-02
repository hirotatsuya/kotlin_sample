package sample

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

// このアノテーションが付いたクラスを1つ創る必要がある
@SpringBootApplication
class KotlinSampleApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinSampleApplication::class.java, *args)
}
