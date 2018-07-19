package saad.firstkotlin.di

import android.content.Context
import dagger.Module
import dagger.Provides
import saad.firstkotlin.data.RoomUser
import javax.inject.Singleton
@Module
class RoomModule {
    @Provides
    @Singleton
    fun provideRoomUser(context: Context) =
            RoomUser.buildPersistentUser(context)
}