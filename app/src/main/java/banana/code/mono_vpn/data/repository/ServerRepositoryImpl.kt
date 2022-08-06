package banana.code.mono_vpn.data.repository

import android.util.Log
import banana.code.mono_vpn.domain.Server
import banana.code.mono_vpn.domain.ServerRepository
import com.google.firebase.storage.StorageReference
import javax.inject.Inject

/**
 * Created by Maksym Kovalchuk on 06.08.2022.
 */
class ServerRepositoryImpl @Inject constructor(
    private val storageReference: StorageReference
): ServerRepository {
    override fun getServersList(): List<Server> {
        storageReference.listAll().addOnSuccessListener {
            it.items.forEach{
                Log.e("logs", it.name)
            }
        }
        Log.e("logs", "success")
        return emptyList()
    }
}