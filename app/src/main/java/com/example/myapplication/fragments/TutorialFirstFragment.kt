package com.example.myapplication.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.viewmodels.TutorialFirstViewModel

class TutorialFirstFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        var binding = ActivityMainBinding.inflate(layoutInflater)

        binding.viewModel = TutorialFirstViewModel()

        return binding.root
    }
}