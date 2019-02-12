package saad.firstkotlin.data

class LocalDataSource: DataSource {
    companion object {
        fun create(): LocalDataSource {
            return LocalDataSource()
        }

    }
    override fun provideList(name: String, callBack: DataSource.CallBack) {
        var list:List<String>
        list=listOf(
                "Mon 6/23 - Sunny - 31/17",
                "Tue 6/24 - Foggy - 21/8",
                "Wed 6/25 - Cloudy - 22/17",
                "Thurs 6/26 - Rainy - 18/11",
                "Fri 6/27 - Foggy - 21/10",
                "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
                "Sun 6/29 - Sunny - 20/7"
        )

        if(list!=null){
            callBack.onListLoaded(list)

        }else
            callBack.onError("sorry")


    }
}
