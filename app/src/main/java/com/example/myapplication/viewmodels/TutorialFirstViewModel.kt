package com.example.myapplication.viewmodels

import com.example.bf_kotlin_client.utils.AppFragmentManager
import com.example.bf_kotlin_client.utils.GlobalVariables
import com.example.myapplication.fragments.TutorialSecondFragment

class TutorialFirstViewModel {
    var fragmentManager = GlobalVariables.instance.fragmentManager
    fun next(){
        fragmentManager.openFragmentAboveMain(AppFragmentManager.FragmentsName.TutorialSecondFragment)
    }
}