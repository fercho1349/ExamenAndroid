package com.anzen.android.examenandroid

import android.graphics.Color
import android.view.View

class ListBikesAdapter : BaseAdapter<Bikes, ListBikesHolder>() {

    override fun getRowViewResourceId(): Int = R.layout.item_bikes
    override fun createHolder(cardView: View, viewType: Int): ListBikesHolder = ListBikesHolder(cardView)
    override fun getItemCount(): Int = if (dataSet.isNullOrEmpty()) 0 else dataSet!!.size

    override fun bindViewHolder(holder: ListBikesHolder, item: Bikes, position: Int) {
        holder.textViewNameId.setText(item.id, "")
        holder.textViewName.setText(item.name, "")
        holder.textViewAdress.setText(item.address, "")
        holder.textViewBikesAvaible.setText(item.bikes, "")
        holder.textViewSpacesAvaible.setText(item.slots, "")
        if(position %2 == 1) {
            holder.itemView.setBackgroundColor(Color.WHITE)
        } else {
            holder.itemView.setBackgroundColor(Color.parseColor("#f4f4f4"))
        }
    }

    override fun bindViewHolderDefaultState(holder: ListBikesHolder) {
        holder.textViewNameId.text = ""
        holder.textViewName.text = ""
        holder.textViewAdress.text = ""
        holder.textViewBikesAvaible.text = ""
        holder.textViewSpacesAvaible.text = ""
    }
}