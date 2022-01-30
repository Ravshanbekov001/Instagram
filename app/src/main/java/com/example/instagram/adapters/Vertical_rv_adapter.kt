package com.example.instagram.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.instagram.R
import kotlinx.android.synthetic.main.vertical_rv_item.view.*
import models.Ver_rv_item_data

class Vertical_rv_adapter(val list: List<Ver_rv_item_data>) :
    RecyclerView.Adapter<Vertical_rv_adapter.VH>() {

    inner class VH(var itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBind(data: Ver_rv_item_data) {
            itemView.post_image.setImageResource(list[position].post_image!!)
            itemView.post_user_name.text = data.post_user_name!!
            itemView.post_user_counry.text = data.post_user_county!!
            itemView.icon.setImageResource(list[position].icon!!)
            itemView.post_dots.setImageResource(list[position].post_dots!!)
            itemView.big_image.setImageResource(list[position].big_image!!)
            itemView.like.setImageResource(list[position].icon_like!!)
            itemView.chat.setImageResource(list[position].icon_chat!!)
            itemView.send.setImageResource(list[position].icon_send!!)
            itemView.pagination.setImageResource(list[position].pagination!!)
            itemView.bookmark.setImageResource(list[position].bookmark!!)
            itemView.small_image.setImageResource(list[adapterPosition].small_image!!)
            itemView.post_text1.text = data.post_text1
            itemView.post_text2.text = data.post_text2
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(LayoutInflater.from(parent.context)
            .inflate(R.layout.vertical_rv_item, parent, false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}