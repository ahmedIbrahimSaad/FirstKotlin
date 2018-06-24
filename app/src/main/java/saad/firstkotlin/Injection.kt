package saad.firstkotlin

import saad.firstkotlin.data.Repo


class Injection {
    companion object {
        fun provideRepo(): Repo {
            return Repo.create()
        }
    }

    // var repo=Repo.create()
}