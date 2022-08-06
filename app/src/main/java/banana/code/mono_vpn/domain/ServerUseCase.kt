package banana.code.mono_vpn.domain

import javax.inject.Inject

/**
 * Created by Maksym Kovalchuk on 06.08.2022.
 */
class ServerUseCase @Inject constructor(private val serverRepository: ServerRepository) {

    fun gerServersList(): List<Server>{
        return serverRepository.getServersList()
    }
}