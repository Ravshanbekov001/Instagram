package com.example.instagram.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagram.R
import kotlinx.android.synthetic.main.horizontal_rv_item.view.*
import kotlinx.android.synthetic.main.profile_item_rv.view.*
import models.Hor_rv_item_data

class ImagesAdapter(val list: List<Int>) :
    RecyclerView.Adapter<ImagesAdapter.VH>() {

    inner class VH(var itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBind(data: Int) {
            itemView.profile_image_item.setImageResource(list[position])
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(LayoutInflater.from(parent.context)
            .inflate(R.layout.profile_item_rv, parent, false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}