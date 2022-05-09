package com.example.myapplication.viewmodels

import com.example.myapplication.utils.AppFragmentManager
import com.example.myapplication.utils.GlobalVariables

class SupplierAuthViewModel {
    var fragmentManager = GlobalVariables.instance.fragmentManager
    fun next() {
        fragmentManager.openFragmentAboveMain(AppFragmentManager.FragmentsName.SupplierProfileFragment)
    }
}