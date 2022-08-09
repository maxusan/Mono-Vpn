package banana.code.mono_vpn.data

import banana.code.mono_vpn.domain.model.Server
import com.google.firebase.storage.ListResult
import java.util.*

/**
 * Created by Maksym Kovalchuk on 09.08.2022.
 */
object ServerMapper {

    fun map(listResult: ListResult): List<Server> {
        val serverList = mutableListOf<Server>()
        listResult.items.forEach {
            serverList.add(
                Server(
                    id = UUID.randomUUID().toString(),
                    serverName = it.name
                )
            )
        }
        return serverList
    }
}