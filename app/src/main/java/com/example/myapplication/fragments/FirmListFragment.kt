package com.example.myapplication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.FirmsListFragmentBinding
import com.example.myapplication.viewmodels.FirmsListViewModel
import com.example.myapplication.viewmodels.TutorialFirstViewModel

class FirmListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        var binding = FirmsListFragmentBinding.inflate(layoutInflater)

        binding.viewModel = FirmsListViewModel()

        return binding.root
    }
}