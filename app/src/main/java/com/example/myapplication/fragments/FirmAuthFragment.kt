package com.example.myapplication.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.RegisterFirmBinding
import com.example.myapplication.viewmodels.FirmAuthViewModel

class FirmAuthFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        var binding = RegisterFirmBinding.inflate(layoutInflater)

        binding.viewModel = FirmAuthViewModel()

        return binding.root
    }
}