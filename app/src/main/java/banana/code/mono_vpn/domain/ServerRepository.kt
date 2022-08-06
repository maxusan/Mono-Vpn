package banana.code.mono_vpn.domain

/**
 * Created by Maksym Kovalchuk on 06.08.2022.
 */
interface ServerRepository {

    fun getServersList(): List<Server>
}