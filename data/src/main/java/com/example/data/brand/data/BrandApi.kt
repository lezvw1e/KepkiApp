package com.example.data.brand.data

import com.example.data.brand.model.BrandDto
import com.example.data.brand.model.BrandResponse
import retrofit2.Response
import retrofit2.http.GET

interface BrandApi {

    @GET("brand")
    suspend fun getBrand(): BrandResponse
}