package banana.code.mono_vpn.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import banana.code.mono_vpn.R
import banana.code.mono_vpn.databinding.FragmentMainBinding
import banana.code.mono_vpn.ui.main.history.HistoryFragment
import banana.code.mono_vpn.ui.main.home.HomeFragment
import banana.code.mono_vpn.ui.main.settings.SettingsFragment

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private lateinit var pagerAdapter: MainFragmentPagerAdapter
    private val fragmentsList = listOf(
        HistoryFragment(),
        HomeFragment(),
        SettingsFragment()
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
        observeEvents()
    }

    private fun setupViews() {
        pagerAdapter = MainFragmentPagerAdapter(this, fragmentsList)
        binding.fragmentsPager.adapter = pagerAdapter
        binding.fragmentsPager.isUserInputEnabled = false
        binding.bnv.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.history -> {
                    binding.fragmentsPager.currentItem = 0
                }
                R.id.home -> {
                    binding.fragmentsPager.currentItem = 1
                }
                R.id.settings -> {
                    binding.fragmentsPager.currentItem = 2
                }
            }
            true
        }
    }

    private fun observeEvents() {
    }
}