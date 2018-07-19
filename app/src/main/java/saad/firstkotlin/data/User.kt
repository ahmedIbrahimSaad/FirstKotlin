package saad.firstkotlin.data

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity (tableName = RoomContract.TABLE_USERS)
data class User (
    @PrimaryKey(autoGenerate = true) val id: Long,
    var name:String,
    var password:String
    )