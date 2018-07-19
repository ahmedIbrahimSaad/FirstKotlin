package saad.firstkotlin.di

import dagger.Component

@Component(modules = arrayOf(AppModule::class,RoomModule::class))
interface MyComponent {
    fun inject(firstKotlin: FirstKotlin)
}