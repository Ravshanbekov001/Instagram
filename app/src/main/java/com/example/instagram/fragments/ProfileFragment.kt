package com.example.instagram.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.instagram.R
import com.example.instagram.adapters.ImagesAdapter
import kotlinx.android.synthetic.main.fragment_profile.*

class ProfileFragment : Fragment() {

    lateinit var list: ArrayList<Int>
    lateinit var imagesAdapter: ImagesAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadData()

        imagesAdapter = ImagesAdapter(list)
        recycler_view.adapter = imagesAdapter

    }

    private fun loadData() {
        list = ArrayList()

        list.add(R.drawable.rectangle)
        list.add(R.drawable.rectangle_1)
        list.add(R.drawable.rectangle_2)
        list.add(R.drawable.rectangle_3)
        list.add(R.drawable.rectangle_4)
        list.add(R.drawable.rectangle_5)
        list.add(R.drawable.rectangle_6)
        list.add(R.drawable.rectangle_7)
    }
}