package com.example.myapplication.viewmodels

import androidx.databinding.ObservableField
import com.example.myapplication.adapters.RvAdapterGoods
import com.example.myapplication.apiworkers.AppAuthApiWorker
import com.example.myapplication.apiworkers.GoodsApiWorker
import com.example.myapplication.dtos.entities.Good
import com.example.myapplication.dtos.responces.GoodsResponse
import com.example.myapplication.utils.GlobalVariables
import com.google.gson.Gson

class GoodResponseViewModel {

    private var responseApiWorker = AppAuthApiWorker()
    var good = Good()
        set(value) {
            field = value
            responseApiWorker.getAllResponses(::updateRv)
        }
    var rvProductsAdapter = ObservableField(RvAdapterResponses(arrayListOf()))

    init {
        responseApiWorker.getAllResponses(::updateRv)
    }

    private fun updateRv(jsonData: String?) {

        var response = Gson().fromJson(jsonData, GoodsResponse::class.java)
        var firm = GlobalVariables.instance.firm
        var filteredResponse =
            response.requests.filter { it.firmId == firm.id } as ArrayList<Good>
        rvAdapterGoods.set(RvAdapterGoods(filteredResponse))

    }
}