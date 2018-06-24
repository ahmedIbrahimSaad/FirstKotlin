package saad.firstkotlin.data

interface DataSource {
    fun provideList(name:String,callBack: CallBack)
    interface CallBack{
        fun onListLoaded(items:List<String>)
        fun onError(message:String)
    }
}