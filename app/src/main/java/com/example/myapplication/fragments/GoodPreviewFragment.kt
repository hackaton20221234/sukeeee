package com.example.myapplication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.adapters.RvAdapterGoods
import com.example.myapplication.databinding.GoodFragmentBinding
import com.example.myapplication.viewmodels.GoodPreviewViewModel

class GoodPreviewFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        var binding = GoodFragmentBinding.inflate(layoutInflater)

        binding.viewModel = RvAdapterGoods.ViewModel()

        return binding.root
    }
}