package saad.firstkotlin.data

interface DataSource {
    fun provideList(name: String, callBack: CallBack)
    fun getAllUser(userListCallBack: UserListCallBack)
    interface CallBack {
        fun onListLoaded(items: List<String>)
        fun onError(message: String)
    }
    interface UserListCallBack {
        fun onListLoaded(users: List<User>)
        fun onError(message: String)
    }
}


