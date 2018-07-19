package saad.firstkotlin.data

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

@Dao
interface RoomUserDao {
    @Query(RoomContract.SELECT_USERS_COUNT)
    fun getUserTotal():Int
    @Insert
    fun insertAll(Users: List<User>)
    @Query(RoomContract.SELECT_USERS)
    fun getAllUsers(): List<User>

}