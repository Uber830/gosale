package com.sena.gosale

import com.google.gson.annotations.SerializedName

data class ProductsResponse(
    @SerializedName("status") var status: String,
    @SerializedName("message") var images: List<String>,
)