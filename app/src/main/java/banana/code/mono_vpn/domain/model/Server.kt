package banana.code.mono_vpn.domain.model

import java.util.*

/**
 * Created by Maksym Kovalchuk on 06.08.2022.
 */
data class Server(
    val id: String = UUID.randomUUID().toString(),
    var serverName: String = "",
    var serverCachePath: String = ""
) {
}