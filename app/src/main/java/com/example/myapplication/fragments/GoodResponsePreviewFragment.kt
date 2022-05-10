package com.example.myapplication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.GoodsFragmentBinding
import com.example.myapplication.dtos.responces.GoodsResponse
import com.example.myapplication.viewmodels.GoodResponseViewModel


class GoodResponsePreviewFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        var binding = GoodsResponsePreviewBinding.inflate(layoutInflater)

        binding.viewModel = GoodResponsePreviewView()

        return binding.root
    }
}