package sample.repository

import sample.BaseRepository
import sample.model.HelloModel
import kotliquery.Session
import kotliquery.queryOf
import kotliquery.Row
import org.springframework.stereotype.Repository

// DBにアクセスして値を取得する
@Repository
class HelloRepository {

    // sql文
    private val selectHelloById : String = "select id, text from hello where id = ?";

    val toHelloModel: (Row) -> HelloModel = { row ->
        HelloModel(
            row.int(columnLabel = "id"),
            row.string(columnLabel = "text")
        )
    }

    // idを用いてtextを取得
    fun getHello(id : Int) : MutableList<HelloModel> {
        val returnedList : MutableList<HelloModel> = mutableListOf();
        BaseRepository.getSession().use<Session, Unit> {
            val selectHello = queryOf(selectHelloById, id).map(toHelloModel).asList;
            println(selectHello)
            returnedList.addAll(it.run(selectHello));
        }
        return returnedList;
    }
}

