package com.cakirhalil.besinkitabi.service

import com.cakirhalil.besinkitabi.model.Besin
import retrofit2.http.GET

interface BesinAPI {
    //https://raw.githubusercontent.com/atilsamancioglu/BTK20-JSONVeriSeti/refs/heads/master/besinler.json

    @GET("besinler.json")
    suspend fun getBesin(): List<Besin>
}