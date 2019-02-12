package saad.firstkotlin.data

class Repo(var mLocalDataSource: LocalDataSource) : DataSource {

    var localDataSource: LocalDataSource



    init {
        this.localDataSource = mLocalDataSource
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