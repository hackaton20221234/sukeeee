package com.example.myapplication.apiworkers
import android.annotation.SuppressLint
import android.provider.Settings
import com.android.volley.Request
import com.android.volley.VolleyError
import com.example.myapplication.dtos.entities.Response
import com.example.myapplication.dtos.requests.AppAuthRequest
import com.example.myapplication.utils.GlobalVariables
import com.google.gson.Gson
class ResponseApiWorkers {
    private var globalVariables = GlobalVariables.instance

    fun getAllResponses(
        successCallbackFunction: (String) -> Unit,
    ) {


        var httpMethod = Request.Method.POST
        var url = "http://151.248.113.116:8080/sellers/getAllResponses"

        var httpWorker = globalVariables.httpWorker

        httpWorker.makeStringRequestWithoutBody(
            httpMethod,
            url,
            successCallbackFunction,
        )
    }
    fun create(response: Response, successCallbackFunction: (String?) -> Unit){

        var httpMethod = Request.Method.POST
        var url = "http://151.248.113.116:8080/sellers/createNewResponse"
        var request = Gson().toJson(response)

        var httpWorker = globalVariables.httpWorker

        httpWorker.makeStringRequestWithBody(
            httpMethod,
            url,
            successCallbackFunction,
            request,
        )
    }
}