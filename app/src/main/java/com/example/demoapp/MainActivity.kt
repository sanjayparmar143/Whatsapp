package com.example.demoapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.demoapp.Adapters.FragmentPageAdapter
import com.example.demoapp.Fragments.CallsFragment
import com.example.demoapp.Fragments.ChatsFragment
import com.example.demoapp.Fragments.StatusFragment
import com.example.demoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var Tabs = arrayOf("Chats", "Status", "Calls")
        var Fragments = arrayOf(ChatsFragment(),StatusFragment(), CallsFragment())

        binding.ViewPager.adapter = FragmentPageAdapter(supportFragmentManager,Tabs,Fragments)
        binding.TabLayout.setupWithViewPager(binding.ViewPager)

    }
}