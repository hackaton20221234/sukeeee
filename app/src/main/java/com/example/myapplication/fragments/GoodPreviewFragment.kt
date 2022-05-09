package com.example.myapplication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.GoodCategoriesFragmentBinding
import com.example.myapplication.databinding.GoodPreviewBinding
import com.example.myapplication.viewmodels.GoodPreviewViewModel
import com.example.myapplication.viewmodels.GoodsCategoriesViewModel

class GoodPreviewFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        var binding = GoodPreviewBinding.inflate(layoutInflater)

        binding.viewModel = GoodPreviewViewModel()

        return binding.root
    }
}