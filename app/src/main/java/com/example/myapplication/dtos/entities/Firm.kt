package com.example.myapplication.dtos.entities

data class Firm (
    var name:String = "",
    var login:String = "",
    var password:String = "",
    var inn:Int = 0,
    var city:String = "",
    var city_index:Int = 0,
    var photo_path:String = ""
){
    var id = 0
}