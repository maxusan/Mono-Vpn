package banana.code.mono_vpn.domain.model

/**
 * Created by Maksym Kovalchuk on 09.08.2022.
 */
sealed class Response {

    class Success(val serversList: List<Server>): Response()
    class Error(val errorMessage: Int): Response()
}