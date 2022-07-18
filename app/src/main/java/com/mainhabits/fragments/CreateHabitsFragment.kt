package com.mainhabits.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mainhabits.databinding.FragmentCreateHabitsBinding


class CreateHabitsFragment : Fragment() {

    private var _binding: FragmentCreateHabitsBinding? = null
    // This property is only valid between onCreateView and onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentCreateHabitsBinding.inflate(inflater, container, false)


        return binding.root

    }


}