package com.example.myapplication.viewmodels

import android.widget.Toast
import androidx.databinding.ObservableField
import com.example.myapplication.apiworkers.GoodsApiWorker
import com.example.myapplication.databinding.GoodsFragmentBinding
import com.example.myapplication.dtos.entities.Good
import com.example.myapplication.dtos.responces.GoodsResponse
import com.example.myapplication.utils.GlobalVariables

class GoodPreviewViewModel {
    var good = Good()
        set(value) {
            field = value
            name.set(good.name)
            price.set(good.price.toString())
        }
    var name = ObservableField("")
    var price = ObservableField("")
    var goodsApiWorker = GoodsApiWorker()
    fun update() {
        var newGood = Good(good.id, name.get().toString())
            ((price.get().toString().toDouble()) * 100).toInt())
        goodsApiWorker.update(newGood
        ) {
            if (it.equals("OK")) {
                good=newGood
            }
            Toast.makeText(GlobalVariables.instance.applicationContext, it, Toast.LENGTH_LONG)
                .show()
        }
    }

    fun delete() {
        goodsApiWorker.delete(good){
            Toast.makeText(GlobalVariables.instance.applicationContext, it, Toast.LENGTH_LONG)
                .show()
        }
    }
    fun openResponsesFragment(){
        var fragmentManager = GlobalVariables.instance.fragmentManager
        fragmentManager.openFragmentAboveMain(GoodsResponse)
        var binding=fragmentManager.getCurrentFragmentBinding<GoodsFragmentBinding>()!!
        var viewModel = binding.viewModel!!
        viewModel.offer=good
    }
}
}