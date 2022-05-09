package com.example.myapplication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.FirmProfileBinding
import com.example.myapplication.viewmodels.FirmsProfileViewModel
import com.example.myapplication.viewmodels.TutorialFirstViewModel

class FirmProfileFragment  : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        var binding = FirmProfileBinding.inflate(layoutInflater)

        binding.viewModel = FirmsProfileViewModel()

        return binding.root
    }
}