package saad.firstkotlin.di

import android.app.Activity
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule (val firstKotlin:FirstKotlin){
    @Provides @Singleton fun provideContext(): Context =firstKotlin
}