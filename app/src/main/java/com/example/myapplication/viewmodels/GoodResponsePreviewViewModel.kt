package com.example.myapplication.viewmodels

import androidx.databinding.ObservableField
import com.example.myapplication.adapters.RvAdapterGoods
import com.example.myapplication.apiworkers.GoodsApiWorker
import com.example.myapplication.dtos.entities.Good
import com.example.myapplication.dtos.responces.GoodsResponse
import com.example.myapplication.utils.GlobalVariables
import com.google.gson.Gson

class GoodResponsePreviewViewModel {

    private var goodsApiWorker = GoodsApiWorker()

    var rvAdapterGoods = ObservableField(RvAdapterGoods(arrayListOf()))

    init {
        goodsApiWorker.getAll(::updateRv)

    }

    private fun updateRv(jsonData: String?) {

        var response = Gson().fromJson(jsonData, GoodsResponse::class.java)
        var buyer = GlobalVariables.instance.firm
        var filteredResponse =
            response.requests.filter { it.buyerId == buyer.id } as ArrayList<Good>
        rvAdapterGoods.set(RvAdapterGoods(filteredResponse))

    }
}