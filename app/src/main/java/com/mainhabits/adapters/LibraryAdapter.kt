package com.mainhabits.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.mainhabits.fragments.HabitsFragment
import com.mainhabits.fragments.RoutinesFragment
import com.mainhabits.fragments.SessionsFragment

private const val NUM_TABS = 3

class LibraryAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return NUM_TABS
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return HabitsFragment()
            1 -> return RoutinesFragment()
        }
        return SessionsFragment()
    }

}