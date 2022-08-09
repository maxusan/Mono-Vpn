package banana.code.mono_vpn.data.utils

import android.content.Context

/**
 * Created by Maksym Kovalchuk on 09.08.2022.
 */
object FileUtils {

    fun clearCacheFolder(context: Context) {
        context.cacheDir.listFiles()?.let {
            it.forEach { file ->
                if (file.isFile)
                    file.deleteRecursively()
            }
        }
    }
}