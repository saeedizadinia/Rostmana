package com.izadinia.rostmana

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CategoryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //inflating the layout for the category fragment
        val rootView = inflater.inflate(R.layout.fragment_category, container, false)
        //setting the recycler view
        val recyclerView = rootView.findViewById<RecyclerView>(R.id.category_recycler)
        val glm = GridLayoutManager(activity, 2)
        recyclerView.layoutManager = glm
        //setting the adapter for recycler view
        val adapter = MyRecyclerAdapter(getModels())
        recyclerView.adapter = adapter
        adapter.notifyDataSetChanged()
        recyclerView.setHasFixedSize(true)
        return rootView
    }

}