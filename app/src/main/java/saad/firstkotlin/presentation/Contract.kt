package saad.firstkotlin.presentation

import saad.firstkotlin.base.BasePresenter
import saad.firstkotlin.base.BaseView

interface Contract {
    interface View: BaseView<Presenter> {
        fun updateView(list: List<String>)
        fun onError(message:String)
    }
    interface Presenter: BasePresenter {
        fun getList(name:String)
    }
}