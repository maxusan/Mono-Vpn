package banana.code.mono_vpn.domain.usecase

import banana.code.mono_vpn.domain.model.Response
import banana.code.mono_vpn.domain.repository.ServerRepository
import javax.inject.Inject

/**
 * Created by Maksym Kovalchuk on 06.08.2022.
 */
class ServerUseCase @Inject constructor(private val serverRepository: ServerRepository) {

    fun getServersList(responseCallback: (Response) -> Unit){
        serverRepository.getServersList {
            responseCallback(it)
        }

    }
}