package com.example.myapplication.viewmodels

import android.widget.Toast
import androidx.databinding.ObservableField
import com.example.myapplication.dtos.entities.Good
import com.example.myapplication.utils.AppFragmentManager
import com.example.myapplication.utils.GlobalVariables

class CreateGoodViewModel {
    var fragmentManager = GlobalVariables.instance.fragmentManager
    var goodssApiWorker = com.example.myapplication.apiworkers.GoodsApiWorker()
    var price = ObservableField("")
    var name = ObservableField("")
    fun create() {
        var good = Good(
            0,
            name.get().toString(),
            price.get().toInt(),
            true, GlobalVariables.instance.firm.id
        )
        goodssApiWorker.create(good, ::successCallbackFunction)
    }

    private fun successCallbackFunction(data: String?) {
        if (data.equals("OK")) {
            fragmentManager.showTab(AppFragmentManager.FragmentsName.GoodFragment)
            Toast.makeText(
                GlobalVariables.instance.applicationContext,
                "success",
                Toast.LENGTH_LONG
            ).show()
        } else {
            Toast.makeText(GlobalVariables.instance.applicationContext, data, Toast.LENGTH_LONG)
                .show()
        }
    }
}