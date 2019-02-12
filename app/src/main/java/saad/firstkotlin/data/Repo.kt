package saad.firstkotlin.data

class Repo : DataSource {

    var localDataSource: LocalDataSource

    companion object {
        fun create(): Repo {
            return Repo()
        }
    }

    init {
        this.localDataSource = LocalDataSource.create()
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