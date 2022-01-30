package com.example.instagram.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagram.R
import kotlinx.android.synthetic.main.horizontal_rv_item.view.*
import models.Hor_rv_item_data

class Horizontal_rv_adapter(val list: List<Hor_rv_item_data>) :
    RecyclerView.Adapter<Horizontal_rv_adapter.VH>() {

    inner class VH(var itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBind(data: Hor_rv_item_data) {
            itemView.circle_image_text.text = data.title!!
            itemView.circularShape.setImageResource(list[position].circularShape!!)
            itemView.circular_image.setImageResource(list[position].circularImage!!)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(LayoutInflater.from(parent.context)
            .inflate(R.layout.horizontal_rv_item, parent, false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}