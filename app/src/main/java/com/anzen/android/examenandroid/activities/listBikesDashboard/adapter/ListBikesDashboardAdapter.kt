package com.anzen.android.examenandroid.activities.listBikesDashboard.adapter

import android.graphics.Color
import android.view.View
import com.anzen.android.examenandroid.R
import com.anzen.android.examenandroid.activities.listBikesDashboard.holder.ListBikesDashboardHolder
import com.anzen.android.examenandroid.base.BaseAdapter
import com.anzen.android.examenandroid.models.Bikes
import com.anzen.android.examenandroid.extensionsFunxtions.setText

class ListBikesDashboardAdapter : BaseAdapter<Bikes, ListBikesDashboardHolder>() {

    override fun getRowViewResourceId(): Int =
        R.layout.item_bikes
    override fun createHolder(cardView: View, viewType: Int): ListBikesDashboardHolder =
        ListBikesDashboardHolder(
            cardView
        )
    override fun getItemCount(): Int = if (dataSet.isNullOrEmpty()) 0 else dataSet!!.size

    override fun bindViewHolder(holder: ListBikesDashboardHolder, item: Bikes, position: Int) {
        holder.textViewNameId.setText("ID: "+item.id, "")
        holder.textViewName.setText("Nombre: "+item.name, "")
        holder.textViewAdress.setText("Dirección: "+item.address, "")
        holder.textViewBikesAvaible.setText("Bicis Disponibles: "+item.bikes, "")
        holder.textViewSpacesAvaible.setText("Espacios Disponibles: "+item.slots, "")
        if(position %2 == 1) {
            holder.itemView.setBackgroundColor(Color.WHITE)
        } else {
            holder.itemView.setBackgroundColor(Color.parseColor("#f4f4f4"))
        }
    }

    override fun bindViewHolderDefaultState(holder: ListBikesDashboardHolder) {
        holder.textViewNameId.text = ""
        holder.textViewName.text = ""
        holder.textViewAdress.text = ""
        holder.textViewBikesAvaible.text = ""
        holder.textViewSpacesAvaible.text = ""
    }
}