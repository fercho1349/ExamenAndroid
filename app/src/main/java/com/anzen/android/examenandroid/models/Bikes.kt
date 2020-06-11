package com.anzen.android.examenandroid.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Bikes : Serializable {

    @SerializedName("id")
    var id: String? = null
    @SerializedName("district")
    var district: String? = null
    @SerializedName("lon")
    var lon: String? = null
    @SerializedName("lat")
    var lat: String? = null
    @SerializedName("bikes")
    var bikes: String? = null
    @SerializedName("slots")
    var slots: String? = null
    @SerializedName("zip")
    var zip: String? = null
    @SerializedName("address")
    var address: String? = null
    @SerializedName("addressNumber")
    var addressNumber: String? = null
    @SerializedName("nearbyStations")
    var nearbyStations: String? = null
    @SerializedName("status")
    var status: String? = null
    @SerializedName("name")
    var name: String? = null
    @SerializedName("stationType")
    var stationType: String? = null
}