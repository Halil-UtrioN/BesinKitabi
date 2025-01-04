package com.cakirhalil.besinkitabi.service

import com.cakirhalil.besinkitabi.model.Besin
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class BesinAPIService {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://raw.githubusercontent.com/atilsamancioglu/BTK20-JSONVeriSeti/refs/heads/master/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(BesinAPI::class.java)

    suspend fun getData(): List<Besin> {
        return retrofit.getBesin()
    }
}