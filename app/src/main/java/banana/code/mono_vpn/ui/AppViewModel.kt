package banana.code.mono_vpn.ui

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import banana.code.mono_vpn.di.DaggerAppComponent
import banana.code.mono_vpn.domain.model.Response
import banana.code.mono_vpn.domain.usecase.ServerUseCase
import banana.code.mono_vpn.domain.usecase.StorageUseCase
import javax.inject.Inject

/**
 * Created by Maksym Kovalchuk on 06.08.2022.
 */
class AppViewModel @Inject constructor(): ViewModel() {

    @Inject lateinit var serverUseCase: ServerUseCase
    @Inject lateinit var storageUseCase: StorageUseCase

    init {
        DaggerAppComponent.create().inject(this)
        serverUseCase.getServersList(){
            when(it){
                is Response.Success -> {
                    storageUseCase.clearCache()
                }
                is Response.Error -> {}
            }
            _firebaseResponseLiveData.postValue(it)
        }
    }

    private val _firebaseResponseLiveData = MutableLiveData<Response>()
    val firebaseResponseLiveData: LiveData<Response> = _firebaseResponseLiveData

}