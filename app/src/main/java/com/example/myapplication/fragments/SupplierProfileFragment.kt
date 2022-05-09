package com.example.myapplication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.SupplierProfileFragmentBinding
import com.example.myapplication.viewmodels.SuppliersProfileViewModel
import com.example.myapplication.viewmodels.TutorialFirstViewModel

class SupplierProfileFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        var binding = SupplierProfileFragmentBinding.inflate(layoutInflater)

        binding.viewModel = SuppliersProfileViewModel()

        return binding.root
    }
}