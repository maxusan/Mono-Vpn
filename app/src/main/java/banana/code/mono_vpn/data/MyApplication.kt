package banana.code.mono_vpn.data

import android.app.Application
import banana.code.mono_vpn.di.AppModule
import banana.code.mono_vpn.di.DaggerAppComponent

/**
 * Created by Maksym Kovalchuk on 06.08.2022.
 */
class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.create()
    }
}