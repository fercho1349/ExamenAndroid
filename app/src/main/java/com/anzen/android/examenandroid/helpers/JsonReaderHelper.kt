package com.anzen.android.examenandroid.helpers

import android.content.Context
import com.anzen.android.examenandroid.R
import com.anzen.android.examenandroid.models.Bikes
import com.anzen.android.examenandroid.models.ResponseListener
import org.json.JSONArray
import java.lang.Exception

class JsonReaderHelper(private val context: Context, val responseListener : ResponseListener<ArrayList<Bikes>>) {

    fun getInfoBikes() {
        try {
            val jsonBikes = context.resources.openRawResource(R.raw.bikes)
                .bufferedReader().use {
                    it.readText()
                }

            val jsonArray = JSONArray(jsonBikes)
            val arrayBikes = ArrayList<Bikes>()
            for (jsonIndex in 0 until jsonArray.length()) {
                val bikes = Bikes()
                bikes.id = jsonArray.getJSONObject(jsonIndex).getString("id")
                try {
                    bikes.district = jsonArray.getJSONObject(jsonIndex).getString("district")
                }catch (e: Exception){
                    bikes.district = "HIP" //ERROR EN EL JSON
                }
                bikes.lon = jsonArray.getJSONObject(jsonIndex).getString("lon")
                bikes.lat = jsonArray.getJSONObject(jsonIndex).getString("lat")
                bikes.bikes = jsonArray.getJSONObject(jsonIndex).getString("bikes")
                bikes.slots = jsonArray.getJSONObject(jsonIndex).getString("slots")
                try {
                    bikes.zip = jsonArray.getJSONObject(jsonIndex).getString("zip")
                }catch (e: Exception){
                    bikes.zip = "06400"   //ERROR EN EL JSON
                }
                bikes.address = jsonArray.getJSONObject(jsonIndex).getString("address")
                bikes.addressNumber = jsonArray.getJSONObject(jsonIndex).getString("addressNumber")
                bikes.nearbyStations = jsonArray.getJSONObject(jsonIndex).getString("nearbyStations")
                bikes.status = jsonArray.getJSONObject(jsonIndex).getString("status")
                bikes.name = jsonArray.getJSONObject(jsonIndex).getString("name")
                bikes.stationType = jsonArray.getJSONObject(jsonIndex).getString("stationType")

                arrayBikes.add(bikes)
            }

            responseListener.onSuccess(arrayBikes)

        }catch (e:Exception){
            responseListener.onError(context.getString(R.string.parsing_error))
        }
    }

}