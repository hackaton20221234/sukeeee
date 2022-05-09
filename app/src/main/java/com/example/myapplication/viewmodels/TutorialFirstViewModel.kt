package com.example.myapplication.viewmodels

import com.example.myapplication.utils.AppFragmentManager
import com.example.myapplication.utils.GlobalVariables

class TutorialFirstViewModel {
    var fragmentManager = GlobalVariables.instance.fragmentManager
    fun next(){
        fragmentManager.openFragmentAboveMain(AppFragmentManager.FragmentsName.TutorialSecondFragment)
    }
}