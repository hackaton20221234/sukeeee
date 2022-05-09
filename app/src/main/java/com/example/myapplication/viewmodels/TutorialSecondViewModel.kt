package com.example.myapplication.viewmodels

import com.example.bf_kotlin_client.utils.AppFragmentManager
import com.example.bf_kotlin_client.utils.GlobalVariables
import com.example.myapplication.fragments.FirmAuthFragment

class TutorialSecondViewModel {
    var fragmentManager = GlobalVariables.instance.fragmentManager
    fun next(){
        fragmentManager.openFragmentAboveMain(AppFragmentManager.FragmentsName.TutorialThirdFragment)
    }
}