package com.example.myapplication.viewmodels

import com.example.myapplication.dtos.entities.Firm
import com.example.myapplication.dtos.entities.Supplier
import com.example.myapplication.dtos.entities.Response
import com.example.myapplication.dtos.responses.SellersResponse
import com.google.gson.Gson

class ResponsePageViewModel {
    var authApiWorker = AuthApiWorker()
    var supplier = Firm()
    var response = Response()
        set(value) {
            field = value
            authApiWorker.getAllSellers {
                var suppliersResponse = Gson().fromJson(it, SuppliersResponse::class.java)
                supplier = suppliersResponse.supplier.first { it.id == value.sellerId}
            }
        }
}