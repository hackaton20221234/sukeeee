package com.example.myapplication.apiworkers

import com.android.volley.Request
import com.example.myapplication.utils.GlobalVariables
import com.example.myapplication.dtos.entities.Firm
import com.example.myapplication.dtos.requests.AppAuthRequest
import com.google.gson.Gson

class AppAuthApiWorker {

    private var globalVariables = GlobalVariables.instance

    fun authByLoginAndPassword(
        login: String,
        password: String,
        successCallbackFunction: (String?) -> Unit,
    ) {

        var appAuthRequest = AppAuthRequest(login, password)

        var httpMethod = Request.Method.POST
        var url = "http://151.248.113.116:8080/sellers/logInByLoginAndPassword"
        var request = Gson().toJson(appAuthRequest)

        var httpWorker = globalVariables.httpWorker

        httpWorker.makeStringRequestWithBody(
            httpMethod,
            url,
            successCallbackFunction,
            request,
        )
    }


    fun reqister(firm: Firm,successCallbackFunction: (String?) -> Unit){

        var httpMethod = Request.Method.POST
        var url = "http://151.248.113.116:8080/sellers/signUp"
        var request = Gson().toJson(firm)

        var httpWorker = globalVariables.httpWorker

        httpWorker.makeStringRequestWithBody(
            httpMethod,
            url,
            successCallbackFunction,
            request,
        )
    }
    fun update(firm: Firm,successCallbackFunction: (String?) ->Unit){
        var httpMethod = Request.Method.POST
        var url = "http://151.248.113.116:8080/sellers/editSeller"
        var request = Gson().toJson(firm)

        var httpWorker = globalVariables.httpWorker

        httpWorker.makeStringRequestWithBody(
            httpMethod,
            url,
            successCallbackFunction,
            request,
        )

    }
    fun getAllSuppliers(successCallbackFunction: (String?) -> Unit){
        var httpMethod = Request.Method.GET
        var url = "http://151.248.113.116:8080/buyers/getAllSellers"

        var httpWorker = globalVariables.httpWorker

        httpWorker.makeStringRequestWithoutBody(
            httpMethod,
            url,
            successCallbackFunction,
        )

    }
}