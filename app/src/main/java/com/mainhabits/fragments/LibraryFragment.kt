package com.mainhabits.fragments

import android.os.Bundle
import android.view.*
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.tabs.TabLayout
import com.mainhabits.R
import com.mainhabits.databinding.FragmentLibraryBinding
import com.mainhabits.models.LibraryViewModel

class LibraryFragment : Fragment() {

    private lateinit var libraryViewModel: LibraryViewModel
    private var _binding: FragmentLibraryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        libraryViewModel =
            ViewModelProvider(this)[LibraryViewModel::class.java]

        _binding = FragmentLibraryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textLibrary
        libraryViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })

        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {

            override fun onTabSelected(tab: TabLayout.Tab?) {
                // Handle tab select
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                // Handle tab reselect
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                // Handle tab unselect
            }
        })



        return root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}