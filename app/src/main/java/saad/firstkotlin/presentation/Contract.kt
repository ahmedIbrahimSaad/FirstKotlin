package saad.firstkotlin.presentation

import saad.firstkotlin.base.BasePresenter
import saad.firstkotlin.base.BaseView
import saad.firstkotlin.data.User

interface Contract {
    interface View: BaseView<Presenter> {
        fun updateView(list: List<String>)
        fun onError(message:String)
        fun userListLoaded(users:List<User>)
        fun userListError(message:String)
    }
    interface Presenter: BasePresenter {
        fun getList(name:String)
        fun getUserList()
    }
}