package com.cakirhalil.besinkitabi.roomdb

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.cakirhalil.besinkitabi.model.Besin

@Dao
interface BesinDAO {

    @Insert
    suspend fun insertAll(vararg besin: Besin): List<Long>

    @Query("SELECT * FROM besin")
    suspend fun getAll(): List<Besin>

    @Query("SELECT * FROM besin WHERE uuid= :besinId")
    suspend fun get(besinId: Int): Besin

    @Query("DELETE FROM besin")
    suspend fun deleteAll(besin: Besin)
}