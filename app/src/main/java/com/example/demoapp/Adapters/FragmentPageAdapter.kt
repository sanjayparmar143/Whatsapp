package com.example.demoapp.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class FragmentPageAdapter(fm: FragmentManager, Tabs: Array<String>, Fragments: Array<Fragment>) : FragmentPagerAdapter(fm) {

    var Tabs = Tabs
    var Fragments = Fragments

    override fun getCount(): Int {

    return Fragments.size
    }

    override fun getItem(position: Int): Fragment {
    return Fragments.get(position)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return Tabs.get(position)
    }
}