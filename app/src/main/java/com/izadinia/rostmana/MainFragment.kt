package com.izadinia.rostmana

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
class MainFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = Navigation.findNavController(view)
        val selectCategories = view.findViewById<ImageButton>(R.id.category_select)
        val selectGender = view.findViewById<ImageButton>(R.id.gender_select)
        selectCategories.setOnClickListener {
            navController.navigate(R.id.action_mainFragment_to_categoryFragment)
        }
        selectGender.setOnClickListener {
            navController.navigate(R.id.action_mainFragment_to_genderSelectionDialog)
        }
    }
}