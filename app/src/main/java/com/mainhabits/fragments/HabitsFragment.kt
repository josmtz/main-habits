package com.mainhabits.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.snackbar.Snackbar
import com.mainhabits.databinding.FragmentHabitsBinding


class HabitsFragment : Fragment() {

    private var _binding: FragmentHabitsBinding? = null
    // This property is only valid between onCreateView and onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHabitsBinding.inflate(inflater, container, false)


        binding.habitsFab.setOnClickListener { view ->
            Snackbar.make(view, "Create a habit", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }


        return binding.root

    }
}