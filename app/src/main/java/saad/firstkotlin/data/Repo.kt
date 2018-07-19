package saad.firstkotlin.data

import javax.inject.Inject

class Repo
@Inject constructor(
        private var localDataSource: DataSource,
        private val roomUser: RoomUser) : DataSource {
    override fun getAllUser(userListCallBack: DataSource.UserListCallBack) {
        val roomUserDao = roomUser.userDao()
        val users: List<User> = roomUserDao.getAllUsers()
        if (users.isEmpty()) {
            userListCallBack.onListLoaded(users)
        } else
            userListCallBack.onError("empty")
    }


    init {
        localDataSource = LocalDataSource.create()
    }


    override fun provideList(name: String, callBack: DataSource.CallBack) {
        localDataSource.provideList(name, object : DataSource.CallBack {
            override fun onError(message: String) {
                callBack.onError(message)
            }

            override fun onListLoaded(items: List<String>) {
                callBack.onListLoaded(items)
            }
        })

    }
}