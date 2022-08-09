package banana.code.mono_vpn.di

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
}