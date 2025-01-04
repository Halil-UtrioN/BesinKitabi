package com.cakirhalil.besinkitabi.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Besin(
    @ColumnInfo("isim") // Bu da room için SerializedName gibi bir şey
    @SerializedName("isim") // Bunun sayesinde değişken adını özgürce isimlendirebiliriz ama bu kısıma API deki key adı neyse onu yazmalıyız.
    val isim: String?,

    @ColumnInfo("kalori")
    @SerializedName("kalori")
    val kalori: String?,

    @ColumnInfo("karbonhidrat")
    @SerializedName("karbonhidrat")
    val karbonhidrat: String?,

    @ColumnInfo("protein")
    @SerializedName("protein")
    val protein: String?,

    @ColumnInfo("gorsel")
    @SerializedName("gorsel")
    val gorsel: String?
) {
    @PrimaryKey(autoGenerate = true)
    var uuid : Int = 0
}