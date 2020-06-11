package com.anzen.android.examenandroid.activities.listBikesDashboard

import android.content.Context
import com.anzen.android.examenandroid.models.Bikes

class ListBikesDashboardContract {

    interface ListBikesDashboardInterface {
        fun getBikes(context: Context)
    }

    interface ViewInterface {
        fun displayBikes(listBikes: ArrayList<Bikes>?)
        fun onError(error: String)
    }
}