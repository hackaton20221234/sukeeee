package com.example.myapplication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.RegisterSupplierBinding
import com.example.myapplication.viewmodels.SupplierAuthViewModel
import com.example.myapplication.viewmodels.TutorialFirstViewModel

class SupplierAuthFragment  : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        var binding = RegisterSupplierBinding.inflate(layoutInflater)

        binding.viewModel = SupplierAuthViewModel()

        return binding.root
    }
}