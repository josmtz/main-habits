package com.mainhabits.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import com.mainhabits.databinding.FragmentRoutinesBinding


class RoutinesFragment : Fragment() {

    private var _binding: FragmentRoutinesBinding? = null
    // This property is only valid between onCreateView and onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRoutinesBinding.inflate(inflater, container, false)



        binding.routinesFab.setOnClickListener { view ->
            Snackbar.make(view, "Create a routine", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }


        return binding.root

    }
}