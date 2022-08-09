package banana.code.mono_vpn.di

import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Maksym Kovalchuk on 06.08.2022.
 */
@Module
class FirebaseModule {

    @Provides
    @Singleton
    fun provideFirebaseStorage(): StorageReference {
        return FirebaseStorage.getInstance().reference
    }
}