package banana.code.mono_vpn.domain.repository

import banana.code.mono_vpn.domain.model.Response

/**
 * Created by Maksym Kovalchuk on 06.08.2022.
 */
interface ServerRepository {

    fun getServersList(responseCallback: (Response) -> Unit)
}