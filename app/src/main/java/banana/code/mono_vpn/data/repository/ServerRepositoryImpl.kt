package banana.code.mono_vpn.data.repository

import banana.code.mono_vpn.domain.Server
import banana.code.mono_vpn.domain.ServerRepository
import javax.inject.Inject

/**
 * Created by Maksym Kovalchuk on 06.08.2022.
 */
class ServerRepositoryImpl @Inject constructor(): ServerRepository {
    override fun getServersList(): List<Server> {
        return emptyList()
    }
}