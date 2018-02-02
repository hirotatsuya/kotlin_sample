package sample.repository

import sample.BaseRepository
import sample.model.CookList
import kotliquery.Session
import kotliquery.queryOf
import kotliquery.Row
import org.springframework.stereotype.Repository

@Repository
class CookListRepository {

    private val selectAll : String = "select * from cook_list";
    private val selectCookListById: String = "select * from cook_list where id = ?";

    val toCookList: (Row) -> CookList = { row ->
        CookList(
            row.int(columnLabel = "id"),
            row.string(columnLabel = "name"),
            row.int(columnLabel = "recipe_id"),
            row.int(columnLabel = "setup_id"),
            row.string(columnLabel = "img_path")
        )
    }

    fun findAll() : MutableList<CookList> {
        val returnedList : MutableList<CookList> = mutableListOf();
        BaseRepository.getSession().use<Session, Unit> {
            val selectCookList = queryOf(selectAll).map(toCookList).asList;
            returnedList.addAll(it.run(selectCookList));
        }
        return returnedList;
    }

    fun getCookListById(id: Int): MutableList<CookList> {
        val returnedList : MutableList<CookList> = mutableListOf();
        BaseRepository.getSession().use<Session, Unit> {
            val selectCookList = queryOf(selectCookListById, id).map(toCookList).asList;
            returnedList.addAll(it.run(selectCookList));
        }
        return returnedList;
    }
}

