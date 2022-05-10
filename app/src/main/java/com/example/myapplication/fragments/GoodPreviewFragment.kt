package com.example.myapplication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.GoodFragmentBinding
import com.example.myapplication.databinding.GoodsFragmentBinding
import com.example.myapplication.viewmodels.GoodPreviewViewModel
import com.example.myapplication.viewmodels.GoodResponsePreviewViewModel

class GoodPreviewFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        var binding = GoodFragmentBinding.inflate(layoutInflater)

        binding.viewModel = GoodPreviewViewModel()

        return binding.root
    }
}