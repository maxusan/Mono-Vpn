package banana.code.mono_vpn.ui.splash

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import banana.code.mono_vpn.R
import banana.code.mono_vpn.domain.model.Response
import banana.code.mono_vpn.ui.AppViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashFragment : Fragment() {

    private val viewModel: AppViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_splash, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.firebaseResponseLiveData.observe(viewLifecycleOwner) {
            when (it) {
                is Response.Success -> {
                    it.serversList.forEach{
                        Log.e("logs", it.toString())
                    }
                    showLoadingAnimationAndDownloadFiles()
                }
                is Response.Error -> {
                    Toast.makeText(requireContext(), getString(it.errorMessage), Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun showLoadingAnimationAndDownloadFiles() {
        showLoading()
    }

    private fun showLoading() {
        lifecycleScope.launch {
            delay(3000)
            findNavController().navigate(SplashFragmentDirections.actionSplashFragmentToMainFragment())
        }
    }

}