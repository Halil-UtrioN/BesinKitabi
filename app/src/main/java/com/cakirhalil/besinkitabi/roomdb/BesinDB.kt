package com.cakirhalil.besinkitabi.roomdb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.cakirhalil.besinkitabi.model.Besin

@Database(entities = [Besin::class], version = 1)
abstract class BesinDB: RoomDatabase() {
    abstract fun besinDAO(): BesinDAO

    companion object {
        // Data Rece önlemleri alınıyor

        @Volatile
        private var instance: BesinDB? = null
        private val lock = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(lock) {
            instance ?: databaseOlustur(context).also {
                instance = it
            }
        }

        private fun databaseOlustur(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            BesinDB::class.java,
            "BesinDB"
        ).build()
    }
}