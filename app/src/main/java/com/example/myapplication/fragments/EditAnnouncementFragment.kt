package com.example.myapplication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.EditAnnouncementBinding
import com.example.myapplication.databinding.GoodsFragmentBinding
import com.example.myapplication.viewmodels.EditAnnouncementViewModel


class EditAnnouncementFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        var binding = EditAnnouncementBinding.inflate(layoutInflater)

        binding.viewModel = EditAnnouncementViewModel()

        return binding.root
    }
}