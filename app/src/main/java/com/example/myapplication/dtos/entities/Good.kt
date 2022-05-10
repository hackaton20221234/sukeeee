package com.example.myapplication.dtos.entities

import java.util.*

class Good(
    var id: Int = 0,
    var name: String = "",
    var totalPrice: Int = 0,
    var supplierId: Int = 0,
    var photo_path: String = "",
    var goods_category_id: Int = 0,
    var delivery_time: Int = 0
)
{
    var price
        get() = totalPrice / 100.0
        set(value) {
            totalPrice = (value * 100).toInt()
        }
}
