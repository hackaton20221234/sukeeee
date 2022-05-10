package com.example.myapplication.apiworkers
import android.annotation.SuppressLint
import android.provider.Settings
import com.android.volley.Request
import com.android.volley.VolleyError
import com.example.myapplication.dtos.requests.AppAuthRequest
import com.example.myapplication.utils.GlobalVariables
import com.google.gson.Gson
class ResponseApiWorkers {
    private var globalVariables = GlobalVariables.instance

    fun getAllResponses(
        successCallbackFunction: (String) -> Unit,
    ) {


        var httpMethod = Request.Method.POST
        var url = "http://151.248.113.116:8080/suppliers/getAllResponses"

        var httpWorker = globalVariables.httpWorker

        httpWorker.makeStringRequestWithoutBody(
            httpMethod,
            url,
            successCallbackFunction,
        )
    }
}