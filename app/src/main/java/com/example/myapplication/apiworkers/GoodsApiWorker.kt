package com.example.myapplication.apiworkers

import com.android.volley.Request
import com.example.myapplication.dtos.entities.Good
import com.example.myapplication.utils.GlobalVariables
import com.google.gson.Gson

class GoodsApiWorker {
    private var globalVariables = GlobalVariables.instance

    fun getAll(successCallbackFunction: (String) -> Unit) {
        val httpMethod = Request.Method.GET
        val url = "http://151.248.113.116:8080/buyers/getAllRequests"

        val httpWorker = globalVariables.httpWorker

        httpWorker.makeStringRequestWithoutBody(
            httpMethod,
            url,
            successCallbackFunction
        )
    }

    fun create(offer: Good, successCallbackFunction: (String?) -> Unit){

        var httpMethod = Request.Method.POST
        var url = "http://151.248.113.116:8080/buyers/createNewRequest"
        var request = Gson().toJson(offer)

        var httpWorker = globalVariables.httpWorker

        httpWorker.makeStringRequestWithBody(
            httpMethod,
            url,
            successCallbackFunction,
            request,
        )
    }
    fun update(good: Good, successCallbackFunction: (String?) -> Unit){

        var httpMethod = Request.Method.PUT
        var url = "http://151.248.113.116:8080/buyers/updateRequest"
        var request = Gson().toJson(good)

        var httpWorker = globalVariables.httpWorker

        httpWorker.makeStringRequestWithBody(
            httpMethod,
            url,
            successCallbackFunction,
            request,
        )
    }
    fun delete(good: Good, successCallbackFunction: (String?) -> Unit){

        var httpMethod = Request.Method.POST
        var url = "http://151.248.113.116:8080/buyers/deleteRequest"
        var request = Gson().toJson(good)
        var httpWorker = globalVariables.httpWorker
        httpWorker.makeStringRequestWithBody(
            httpMethod,
            url,
            successCallbackFunction,
            request
        ) {
            it.message

        }
    }
}