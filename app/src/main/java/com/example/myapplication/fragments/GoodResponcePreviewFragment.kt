package com.example.myapplication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.ThirdTutorialActivityBinding
import com.example.myapplication.viewmodels.GoodResponsesViewModel
import com.example.myapplication.viewmodels.TutorialThirdViewModel

class GoodResponcePreviewFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        var binding = GoodResponsesBinding.inflate(layoutInflater)

        binding.viewModel = GoodResponsesViewModel()

        return binding.root
    }
}