package banana.code.mono_vpn.data.repository

import android.content.Context
import banana.code.mono_vpn.domain.repository.StorageRepository
import javax.inject.Inject

/**
 * Created by Maksym Kovalchuk on 09.08.2022.
 */
class StorageRepositoryImpl @Inject constructor(): StorageRepository {
    override fun clearCache() {
//        context.cacheDir.listFiles()?.let {
//            it.forEach { file ->
//                file.deleteRecursively()
//            }
//        }
    }
}