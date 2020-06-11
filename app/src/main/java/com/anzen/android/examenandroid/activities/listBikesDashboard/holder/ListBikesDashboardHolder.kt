package com.anzen.android.examenandroid.activities.listBikesDashboard.holder

import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import com.anzen.android.examenandroid.base.BaseHolder
import kotlinx.android.synthetic.main.item_bikes.view.*

class ListBikesDashboardHolder (itemView: View) : BaseHolder(itemView) {

    val textViewNameId = itemView.textViewNameId as AppCompatTextView
    val textViewName = itemView.textViewName as AppCompatTextView
    val textViewAdress = itemView.textViewAdress as AppCompatTextView
    val textViewBikesAvaible = itemView.textViewBikesAvaible as AppCompatTextView
    val textViewSpacesAvaible = itemView.textViewSpacesAvaible as AppCompatTextView
}