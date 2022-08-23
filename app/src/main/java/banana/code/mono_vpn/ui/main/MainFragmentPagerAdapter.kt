package banana.code.mono_vpn.ui.main

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

/**
 * Created by Maksym Kovalchuk on 23.08.2022.
 */
class MainFragmentPagerAdapter(fragment: Fragment, private val fragmentsList: List<Fragment>): FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = fragmentsList.size

    override fun createFragment(position: Int): Fragment = fragmentsList[position]
}