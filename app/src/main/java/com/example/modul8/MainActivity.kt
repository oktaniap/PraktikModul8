package com.example.modul8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //mengatur viewpager tiap tab
        view_pager.adapter = ViewPagerAdapter(
            this, supportFragmentManager)
        tabs.setupWithViewPager(view_pager)
    }
}