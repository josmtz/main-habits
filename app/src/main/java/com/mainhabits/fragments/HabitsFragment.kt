package com.mainhabits.fragments

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.mainhabits.databinding.FragmentCreateHabitsBinding
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

            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.replace(com.mainhabits.R.id.library_container, CreateHabitsFragment())
            transaction?.disallowAddToBackStack()
            transaction?.commit()


            Snackbar.make(view, "Create a habit", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }


        return binding.root

    }
}