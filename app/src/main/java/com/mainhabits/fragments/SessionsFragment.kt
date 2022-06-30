package com.mainhabits.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import com.mainhabits.databinding.FragmentSessionsBinding


class SessionsFragment : Fragment() {

    private var _binding: FragmentSessionsBinding? = null
    // This property is only valid between onCreateView and onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSessionsBinding.inflate(inflater, container, false)


        binding.sessionsFab.setOnClickListener { view ->
            Snackbar.make(view, "Create a session", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }


        return binding.root
    }
}