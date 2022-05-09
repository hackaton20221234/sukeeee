package com.example.myapplication.localdb.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "key_value_pairs")
class KeyValuePair(
    @PrimaryKey
    var key: String = "",
    var value: String = ""
)
