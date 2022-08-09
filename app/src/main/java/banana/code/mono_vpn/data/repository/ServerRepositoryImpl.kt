package banana.code.mono_vpn.data.repository

import banana.code.mono_vpn.R
import banana.code.mono_vpn.data.ServerMapper
import banana.code.mono_vpn.domain.model.Response
import banana.code.mono_vpn.domain.repository.ServerRepository
import com.google.firebase.storage.StorageReference
import javax.inject.Inject

/**
 * Created by Maksym Kovalchuk on 06.08.2022.
 */
class ServerRepositoryImpl @Inject constructor(
    private val storageReference: StorageReference,
): ServerRepository {
    override fun getServersList(responseCallback: (Response) -> Unit) {
        storageReference.listAll().addOnSuccessListener {
            val serversList = ServerMapper.map(it)
            responseCallback(Response.Success(serversList))
        }.addOnFailureListener {
            responseCallback(Response.Error(R.string.error))
        }
    }
}