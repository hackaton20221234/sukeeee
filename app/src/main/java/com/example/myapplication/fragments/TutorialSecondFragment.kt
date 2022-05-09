package com.example.myapplication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.SecondTutotrialActivityBinding
import com.example.myapplication.viewmodels.TutorialSecondViewModel

class TutorialSecondFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        var binding = SecondTutotrialActivityBinding.inflate(layoutInflater)

        binding.viewModel = TutorialSecondViewModel()

        return binding.root
    }
}