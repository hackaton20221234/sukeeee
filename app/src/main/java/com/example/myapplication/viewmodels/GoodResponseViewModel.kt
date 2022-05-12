package com.example.myapplication.viewmodels

import androidx.databinding.ObservableField

import com.example.myapplication.adapters.RvAdapterResponses

import com.example.myapplication.apiworkers.ResponseApiWorkers
import com.example.myapplication.dtos.entities.Good
import com.example.myapplication.dtos.entities.Response

import com.example.myapplication.dtos.responces.ResponseDto
import com.example.myapplication.utils.GlobalVariables
import com.google.gson.Gson

class GoodResponseViewModel {

    private var responseApiWorkers = ResponseApiWorkers()
    var good = Good()
        set(value) {
            field = value
            responseApiWorkers.getAllResponses(::updateRv)
        }

    var rvProductsAdapter = ObservableField(RvAdapterResponses(arrayListOf()))

    init {
        responseApiWorkers.getAllResponses(::updateRv)
    }

    private fun updateRv(jsonData: String?) {
        var responsesDto = Gson().fromJson(jsonData, ResponseDto::class.java)
        var firm = GlobalVariables.instance.firm
        var filteredResponse =
            responsesDto.response.filter { it.requestId == good.id } as ArrayList<Response>
        rvProductsAdapter.set(RvAdapterResponses(filteredResponse))

    }
}