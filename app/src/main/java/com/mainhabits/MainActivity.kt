package com.mainhabits

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.*
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView
import com.mainhabits.activities.CalendarActivity
import com.mainhabits.activities.LibraryActivity
import com.mainhabits.activities.SettingsActivity
import com.mainhabits.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var appBarConfiguration: AppBarConfiguration


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bottomNavView: BottomNavigationView = binding.bottomNavView

        bottomNavView.selectedItemId = R.id.item_home

        // Perform item selected listener
        bottomNavView.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.item_home -> return@OnItemSelectedListener true
                R.id.item_library -> {
                    startActivity(Intent(applicationContext, LibraryActivity::class.java))
                    overridePendingTransition(0, 0)
                    return@OnItemSelectedListener true
                }
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
        actionBar!!.title = "Main Habits"

        // providing subtitle for the ActionBar
//        actionBar.subtitle = "The system to build daily habits"

        // adding icon in the ActionBar
//        actionBar.setIcon(R.drawable.app_logo)

        // methods to display the icon in the ActionBar
        actionBar.setDisplayUseLogoEnabled(true)
        actionBar.setDisplayShowHomeEnabled(true)


    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.top_nav_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.settings ->
                startActivity(Intent(this, SettingsActivity::class.java))
        }
        return super.onOptionsItemSelected(item)
    }



}