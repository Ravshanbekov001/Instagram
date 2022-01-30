package com.example.instagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.instagram.fragments.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = HomeFragment()
        val searchFragment = SearchFragment()
        val addFragment = AddFragment()
        val favouriteFragment = FavouriteFragment()
        val profileFragment = ProfileFragment()
        val fragmentManager = supportFragmentManager

        fragmentManager.beginTransaction()
            .add(R.id.liner_container, homeFragment)
            .commit()

        bottom_nav_view.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    fragmentManager.beginTransaction()
                        .replace(R.id.liner_container, homeFragment)
                        .commit()
                }

                R.id.search -> {
                    fragmentManager.beginTransaction()
                        .replace(R.id.liner_container, searchFragment)
                        .commit()
                }

                R.id.add -> {
                    fragmentManager.beginTransaction()
                        .replace(R.id.liner_container, addFragment)
                        .commit()
                }

                R.id.favourite -> {
                    fragmentManager.beginTransaction()
                        .replace(R.id.liner_container, favouriteFragment)
                        .commit()
                }

                R.id.user -> {
                    fragmentManager.beginTransaction()
                        .replace(R.id.liner_container, profileFragment)
                        .commit()
                }

            }
            true
        }

    }
}