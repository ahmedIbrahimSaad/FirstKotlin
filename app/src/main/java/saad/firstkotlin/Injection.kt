package saad.firstkotlin

import saad.firstkotlin.data.LocalDataSource
import saad.firstkotlin.data.Repo


class Injection {
    companion object {
        fun provideRepo(): Repo {
            return Repo(LocalDataSource.create())
        }
    }

    // var repo=Repo.create()
}