package saad.firstkotlin.data

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context

@Database(
        entities = arrayOf(User::class),
        version = 1)
 abstract class RoomUser : RoomDatabase() {
    abstract fun userDao(): RoomUserDao

    companion object {
        fun buildPersistentUser(context: Context): RoomUser = Room.databaseBuilder(
                context.applicationContext,
                RoomUser::class.java,
                RoomContract.DATABASE_USER
        ).build()
    }

    fun getAllUsers(): List<User> {
        val mutableUserList = mutableListOf<User>()
        mutableUserList.add(createUserEntity(1,"saad", "123456"))
        return mutableUserList
    }

    private fun createUserEntity(id:Long,name: String, password: String) =
            User(id,name,password )

}