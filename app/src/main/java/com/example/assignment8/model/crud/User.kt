package com.example.assignment8.model.crud


import com.google.gson.annotations.SerializedName
import xcom.example.assignment8.model.crud.UserData

data class User(
    @SerializedName("error")
    val error: Boolean,
    @SerializedName("user")
    val user: UserData
)