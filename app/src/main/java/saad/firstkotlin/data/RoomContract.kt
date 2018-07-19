package saad.firstkotlin.data

class RoomContract {

        companion object {

            const val DATABASE_USER = "user.db"

            const val TABLE_USERS = "users"

            private const val SELECT_COUNT = "SELECT COUNT(*) FROM "
            private const val SELECT_FROM = "SELECT * FROM "

            const val SELECT_USERS_COUNT = SELECT_COUNT + TABLE_USERS
            const val SELECT_USERS = SELECT_FROM + TABLE_USERS

        }
}