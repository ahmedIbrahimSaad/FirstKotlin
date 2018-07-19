package saad.firstkotlin.di

import android.app.Application

class FirstKotlin: Application() {
    companion object {
        lateinit var myComponent: MyComponent
    }
    override fun onCreate() {
        super.onCreate()
        initDagger()
    }

    private fun initDagger() {
      myComponent=DaggerMyComponent.builder().appModule(AppModule(this)).build()
    }
}