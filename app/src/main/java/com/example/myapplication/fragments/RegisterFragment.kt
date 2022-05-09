package com.example.myapplication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.GoodPreviewBinding
import com.example.myapplication.databinding.RegisterActivityBinding
import com.example.myapplication.viewmodels.GoodPreviewViewModel
import com.example.myapplication.viewmodels.RegisterViewModel

class RegisterFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        var binding = RegisterActivityBinding.inflate(layoutInflater)

        binding.viewModel = RegisterViewModel()

        return binding.root
    }
}