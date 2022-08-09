package banana.code.mono_vpn.domain.usecase

import android.content.Context
import banana.code.mono_vpn.domain.repository.StorageRepository
import javax.inject.Inject

/**
 * Created by Maksym Kovalchuk on 09.08.2022.
 */
class StorageUseCase @Inject constructor(val storageRepository: StorageRepository) {

    fun clearCache(){
        storageRepository.clearCache()
    }
}