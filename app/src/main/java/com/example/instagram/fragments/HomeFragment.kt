package com.example.instagram.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.instagram.R
import com.example.instagram.adapters.Horizontal_rv_adapter
import com.example.instagram.adapters.Vertical_rv_adapter
import kotlinx.android.synthetic.main.fragment_home.*
import models.Hor_rv_item_data
import models.Ver_rv_item_data

class HomeFragment : Fragment() {

    lateinit var horizontalRvAdapter: Horizontal_rv_adapter
    lateinit var verticalRvAdapter: Vertical_rv_adapter

    lateinit var list: ArrayList<Hor_rv_item_data>
    lateinit var list2: ArrayList<Ver_rv_item_data>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {


        return inflater.inflate(R.layout.fragment_home, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        horizontal_rv.layoutManager =
            LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)

        loadData()

        horizontalRvAdapter = Horizontal_rv_adapter(list)
        horizontal_rv.adapter = horizontalRvAdapter


        loadData2()

        verticalRvAdapter = Vertical_rv_adapter(list2)
        vertical_rv.adapter = verticalRvAdapter
    }


    private fun loadData() {
        list = ArrayList()

        list.add(Hor_rv_item_data("Your Story", R.drawable.circular_shape1, R.drawable.your_story))
        list.add(Hor_rv_item_data("karennne",
            R.drawable.circular_shape2,
            R.drawable.circular_image2))
        list.add(Hor_rv_item_data("zackjohn",
            R.drawable.circular_shape3,
            R.drawable.circular_image3))
        list.add(Hor_rv_item_data("kieron_d",
            R.drawable.circular_shape1,
            R.drawable.circular_image4))
        list.add(Hor_rv_item_data("craig_love",
            R.drawable.circular_shape1,
            R.drawable.circular_image2))
        list.add(Hor_rv_item_data("avenger", R.drawable.circular_shape1, R.drawable.your_story))
        list.add(Hor_rv_item_data("karennne",
            R.drawable.circular_shape2,
            R.drawable.circular_image2))
        list.add(Hor_rv_item_data("zackjohn",
            R.drawable.circular_shape3,
            R.drawable.circular_image3))
        list.add(Hor_rv_item_data("kieron_d",
            R.drawable.circular_shape1,
            R.drawable.circular_image4))
        list.add(Hor_rv_item_data("craig_love",
            R.drawable.circular_shape1,
            R.drawable.circular_image2))
    }


    private fun loadData2() {

        list2 = ArrayList()

        list2.add(Ver_rv_item_data(
            R.drawable.post_image1,
            "joshua_l",
            "Tokyo, Japan",
            R.drawable.ic_copyright,
            R.drawable.ic_dots,
            R.drawable.post_image2,
            R.drawable.ic_shape__3_,
            R.drawable.ic_shape__3_,
            R.drawable.ic_messanger,
            R.drawable.pagination,
            R.drawable.ic_bookmark,
            R.drawable.small_image,
            "Liked by craig_love and 44,686 others",
            "joshua_l The game in Japan was amazing and I want to share some photos"))

        list2.add(Ver_rv_item_data(
            R.drawable.post_image1,
            "joshua_l",
            "Tokyo, Japan",
            R.drawable.ic_copyright,
            R.drawable.ic_dots,
            R.drawable.android,
            R.drawable.ic_shape__3_,
            R.drawable.ic_shape__3_,
            R.drawable.ic_messanger,
            R.drawable.pagination,
            R.drawable.ic_bookmark,
            R.drawable.small_image,
            "Liked by craig_love and 44,686 others",
            "joshua_l The game in Japan was amazing and I want to share some photos"))

        list2.add(Ver_rv_item_data(
            R.drawable.post_image1,
            "joshua_l",
            "Tokyo, Japan",
            R.drawable.ic_copyright,
            R.drawable.ic_dots,
            R.drawable.messi,
            R.drawable.ic_shape__3_,
            R.drawable.ic_shape__3_,
            R.drawable.ic_messanger,
            R.drawable.pagination,
            R.drawable.ic_bookmark,
            R.drawable.small_image,
            "Liked by craig_love and 44,686 others",
            "joshua_l The game in Japan was amazing and I want to share some photos"))

        list2.add(Ver_rv_item_data(
            R.drawable.post_image1,
            "joshua_l",
            "Tokyo, Japan",
            R.drawable.ic_copyright,
            R.drawable.ic_dots,
            R.drawable.nature,
            R.drawable.ic_shape__3_,
            R.drawable.ic_shape__3_,
            R.drawable.ic_messanger,
            R.drawable.pagination,
            R.drawable.ic_bookmark,
            R.drawable.small_image,
            "Liked by craig_love and 44,686 others",
            "joshua_l The game in Japan was amazing and I want to share some photos"))

        list2.add(Ver_rv_item_data(
            R.drawable.post_image1,
            "joshua_l",
            "Tokyo, Japan",
            R.drawable.ic_copyright,
            R.drawable.ic_dots,
            R.drawable.black_star,
            R.drawable.ic_shape__3_,
            R.drawable.ic_shape__3_,
            R.drawable.ic_messanger,
            R.drawable.pagination,
            R.drawable.ic_bookmark,
            R.drawable.small_image,
            "Liked by craig_love and 44,686 others",
            "joshua_l The game in Japan was amazing and I want to share some photos"))

    }
}