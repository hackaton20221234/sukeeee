package com.example.myapplication.viewmodels

import androidx.databinding.ObservableField
import com.example.myapplication.apiworkers.AppAuthApiWorker
import com.example.myapplication.dtos.entities.Firm
import com.example.myapplication.dtos.entities.Response
import com.example.myapplication.dtos.responces.SuppliersResponse
import com.google.gson.Gson

class ResponsePageViewModel {
    var authApiWorker = AppAuthApiWorker()
    var supplier = Firm()
        set(value) {
            field = value
            sellerName.set(supplier.name)
            sellerLogin.set(supplier.login)
        }
    var sellerName = ObservableField("")
    var sellerLogin = ObservableField("")
    var response = Response()
        set(value) {
            field = value
            authApiWorker.getAllSuppliers {
                var supplierResponse = Gson().fromJson(it, SuppliersResponse::class.java)
                supplier = supplierResponse.supplier.first { it.id == value.supplierId }
            }
        }
}