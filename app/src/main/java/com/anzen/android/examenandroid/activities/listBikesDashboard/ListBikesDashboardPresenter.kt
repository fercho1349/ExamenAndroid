package com.anzen.android.examenandroid.activities.listBikesDashboard

import android.content.Context
import com.anzen.android.examenandroid.helpers.JsonReaderHelper
import com.anzen.android.examenandroid.models.Bikes
import com.anzen.android.examenandroid.models.ResponseListener

class ListBikesDashboardPresenter (private var viewInterface: ListBikesDashboardContract.ViewInterface
): ListBikesDashboardContract.ListBikesDashboardInterface,
    ResponseListener<ArrayList<Bikes>> {

    override fun getBikes(context: Context) {
        val jsonReaderHelper = JsonReaderHelper(context, this)
        jsonReaderHelper.getInfoBikes()
    }

    override fun onSuccess(responseObject: ArrayList<Bikes>) {
        viewInterface.displayBikes(responseObject)
    }

    override fun onError(error: String) {
        viewInterface.onError(error)
    }

}