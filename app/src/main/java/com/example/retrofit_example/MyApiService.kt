package com.example.retrofit_example

import retrofit2.Call
import retrofit2.http.*

interface MyApiService {
    @GET("getNoiseMeasurePUS/v1/noiseMeasurePUS")
    fun getNoiseData(
        @Query("page") page : Int,
        @Query("perPage") perPage : Int,
        @Query("returnType") returnType : String
    ) : Call<NoiseModel>
}