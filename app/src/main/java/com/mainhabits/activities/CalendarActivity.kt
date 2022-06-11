package com.mainhabits.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView
import com.mainhabits.MainActivity
import com.mainhabits.R
import com.mainhabits.databinding.ActivityCalendarBinding

class CalendarActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCalendarBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalendarBinding.inflate(layoutInflater)
        setContentView(this.binding.root)

        val bottomNavView: BottomNavigationView = binding.bottomNavView

        bottomNavView.selectedItemId = R.id.item_calendar

        // Perform item selected listener
        bottomNavView.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.item_home -> {
                    startActivity(Intent(applicationContext, MainActivity::class.java))
                    overridePendingTransition(0, 0)
                    return@OnItemSelectedListener true
                }
                R.id.item_library -> {
                    startActivity(Intent(applicationContext, LibraryActivity::class.java))
                    overridePendingTransition(0, 0)
                    return@OnItemSelectedListener true
                }
                R.id.item_calendar -> return@OnItemSelectedListener true
            }
            false
        })
    }
}