package com.camilogo1200.viewpager2

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import com.camilogo1200.viewpager2.adapter.ViewPagerAdapter
import com.camilogo1200.viewpager2.adapter.ZoomOutPageTransformer
import com.camilogo1200.viewpager2.databinding.ActivityMainBinding

class MainActivity : FragmentActivity() {

    private lateinit var viewPager2: ViewPager2
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setContentView(binding.root)

        viewPager2 = binding.viewPager2

        val pagerAdapter = ViewPagerAdapter(this)
        viewPager2.adapter = pagerAdapter

        viewPager2.setPageTransformer(ZoomOutPageTransformer())
    }

    override fun onBackPressed() {
        if (viewPager2.currentItem == 0) {
            super.onBackPressed()
        } else {
            viewPager2.currentItem = viewPager2.currentItem - 1
        }
    }
}
