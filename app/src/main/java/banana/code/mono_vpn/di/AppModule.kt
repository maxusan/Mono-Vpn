package banana.code.mono_vpn.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import banana.code.mono_vpn.data.repository.ServerRepositoryImpl
import banana.code.mono_vpn.domain.repository.ServerRepository
import com.google.firebase.storage.StorageReference
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


/**
 * Created by Maksym Kovalchuk on 06.08.2022.
 */
@Module
class AppModule {

    @Singleton
    @Provides
    fun provideServerRepository(storageReference: StorageReference): ServerRepository {
        return ServerRepositoryImpl(storageReference)
    }

    @Provides
    fun provideSharedPreferences(application: Application): SharedPreferences {
        return application.getSharedPreferences("sp", Context.MODE_PRIVATE)
    }
}