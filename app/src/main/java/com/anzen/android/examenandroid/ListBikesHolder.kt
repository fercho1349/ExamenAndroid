package com.anzen.android.examenandroid

import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import kotlinx.android.synthetic.main.item_bikes.view.*

class ListBikesHolder (itemView: View) : BaseHolder(itemView) {

    val textViewNameId = itemView.textViewNameId as AppCompatTextView
    val textViewName = itemView.textViewName as AppCompatTextView
    val textViewAdress = itemView.textViewAdress as AppCompatTextView
    val textViewBikesAvaible = itemView.textViewBikesAvaible as AppCompatTextView
    val textViewSpacesAvaible = itemView.textViewSpacesAvaible as AppCompatTextView
}