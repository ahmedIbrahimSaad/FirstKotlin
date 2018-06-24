package saad.firstkotlin.base

interface BaseView<T> {
    fun setPresenter(presenter: T)
}