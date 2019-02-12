package saad.firstkotlin.presentation

import saad.firstkotlin.data.DataSource
import saad.firstkotlin.data.Repo

class Presenter(var repo: Repo, var view: Contract.View) : Contract.Presenter {




    override fun getList(name: String) {
        repo.provideList(name,object : DataSource.CallBack{
            override fun onListLoaded(items: List<String>) {
                view.updateView(items)
            }

            override fun onError(message: String) {
                view.onError(message)
            }
        })

    }

    override fun start() {
        //To change body of created functions use File | Settings | File Templates.
    }


}