package com.camilogo1200.viewpager2.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.camilogo1200.viewpager2.View1Fragment
import com.camilogo1200.viewpager2.View2Fragment
import com.camilogo1200.viewpager2.View3Fragment

private const val NUM_PAGES = 3

class ViewPagerAdapter(private val screenContainer: FragmentActivity) :
    FragmentStateAdapter(screenContainer) {

    override fun getItemCount(): Int = NUM_PAGES
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            1 -> View1Fragment()
            2 -> View2Fragment()
            else -> View3Fragment()
        }
    }
}