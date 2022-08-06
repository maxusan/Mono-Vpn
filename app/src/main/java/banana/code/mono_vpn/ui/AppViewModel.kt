package banana.code.mono_vpn.ui

import androidx.lifecycle.ViewModel
import banana.code.mono_vpn.di.DaggerAppComponent
import banana.code.mono_vpn.domain.ServerUseCase
import javax.inject.Inject

/**
 * Created by Maksym Kovalchuk on 06.08.2022.
 */
class AppViewModel @Inject constructor(): ViewModel() {

    @Inject lateinit var serverUseCase: ServerUseCase

    init {
        DaggerAppComponent.create().inject(this)
    }

    fun getServersList(){
        serverUseCase.gerServersList()
    }

}