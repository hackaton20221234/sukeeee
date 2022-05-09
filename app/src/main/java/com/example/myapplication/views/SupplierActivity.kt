package com.example.myapplication.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.FirmMainActivityBinding
import com.example.myapplication.viewmodels.FirmMainViewModel

class SupplierActivity : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        var binding = FirmMainActivityBinding.inflate(layoutInflater)

        binding.viewModel = FirmMainViewModel()

        return binding.root
    }
}