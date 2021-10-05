package com.sena.gosale

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {
    @GET
   suspend fun getProducts(@Url url:String): Response<ProductsResponse>
}