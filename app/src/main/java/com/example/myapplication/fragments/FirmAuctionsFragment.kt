package com.example.myapplication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.FirmAuctionsBinding
import com.example.myapplication.viewmodels.FirmAuctionsViewModel

class FirmAuctionsFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        var binding = FirmAuctionsBinding.inflate(layoutInflater)

        binding.viewModel = FirmAuctionsViewModel()

        return binding.root
    }
}