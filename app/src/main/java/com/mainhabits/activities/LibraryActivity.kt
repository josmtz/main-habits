package com.mainhabits.activities

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.ui.*
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView
import com.mainhabits.MainActivity
import com.mainhabits.databinding.ActivityLibraryBinding
import com.mainhabits.R


class LibraryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLibraryBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLibraryBinding.inflate(layoutInflater)
        setContentView(this.binding.root)

        val bottomNavView: BottomNavigationView = binding.bottomNavView

        bottomNavView.selectedItemId = R.id.item_library

        // Perform item selected listener
        bottomNavView.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.item_home -> {
                    startActivity(Intent(applicationContext, MainActivity::class.java))
                    overridePendingTransition(0, 0)
                    return@OnItemSelectedListener true
                }
                R.id.item_library -> return@OnItemSelectedListener true

                R.id.item_calendar -> {
                    startActivity(Intent(applicationContext, CalendarActivity::class.java))
                    overridePendingTransition(0, 0)
                    return@OnItemSelectedListener true
                }
            }
            false
        })

        // use ActionBar utility methods
        val actionBar = supportActionBar
        // providing title for the ActionBar
        actionBar!!.title = "Library"
    }


}