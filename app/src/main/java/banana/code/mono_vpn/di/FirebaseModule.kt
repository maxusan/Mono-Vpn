package banana.code.mono_vpn.di

import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import dagger.Module
import dagger.Provides

/**
 * Created by Maksym Kovalchuk on 06.08.2022.
 */
@Module
class FirebaseModule {

    @Provides
    fun provideFirebaseStorage(): StorageReference {
        return FirebaseStorage.getInstance().reference
    }
}