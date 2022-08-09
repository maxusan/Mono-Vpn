package banana.code.mono_vpn.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import banana.code.mono_vpn.R
import banana.code.mono_vpn.data.repository.ServerRepositoryImpl
import banana.code.mono_vpn.di.DaggerAppComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private val viewModel: AppViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerAppComponent.create().inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}