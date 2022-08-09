package banana.code.mono_vpn.di

import android.content.Context
import banana.code.mono_vpn.data.repository.ServerRepositoryImpl
import banana.code.mono_vpn.data.repository.StorageRepositoryImpl
import banana.code.mono_vpn.domain.repository.ServerRepository
import banana.code.mono_vpn.domain.repository.StorageRepository
import com.google.firebase.storage.StorageReference
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


/**
 * Created by Maksym Kovalchuk on 06.08.2022.
 */
@Module
class AppModule {

//    @Singleton
//    @Provides
//    fun provideContext(): Context {
//        return context
//    }

    @Singleton
    @Provides
    fun provideServerRepository(storageReference: StorageReference): ServerRepository {
        return ServerRepositoryImpl(storageReference)
    }

    @Singleton
    @Provides
    fun provideStorageRepository(): StorageRepository {
        return StorageRepositoryImpl()
    }

//    @Singleton
//    @Provides
//    fun provideContext(context: Context): Context {
//        return context
//    }
}