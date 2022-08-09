package banana.code.mono_vpn.di

import banana.code.mono_vpn.ui.AppViewModel
import banana.code.mono_vpn.ui.MainActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Maksym Kovalchuk on 06.08.2022.
 */
@Singleton
@Component(modules = [FirebaseModule::class, AppModule::class])
interface AppComponent {

    fun inject(mainActivity: MainActivity)
    fun inject(appViewModel: AppViewModel)
   // fun inject(storageRepository: StorageRepository)
}