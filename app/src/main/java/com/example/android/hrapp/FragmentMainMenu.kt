package com.example.android.hrapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class FragmentMainMenu: Fragment(R.layout.main_menu_fragment) {

    private lateinit var btnTeleBook: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnTeleBook= view.findViewById(R.id.button2)
        setTeleBook()
    }

    private fun setTeleBook() {
        btnTeleBook.setOnClickListener {
            (activity as MainActivity).showTelephoneBook()
        }
    }

}