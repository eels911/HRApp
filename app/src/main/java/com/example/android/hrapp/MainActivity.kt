package com.example.android.hrapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showStartFragment()
    }

    fun showTelephoneBook(){
        showTelephoneBookFragment()
    }

    private fun showTelephoneBookFragment() {
        val newFragment = TelephoneBookFragment()

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.id_frame_container, newFragment)
            .addToBackStack(null)
            .commit()
    }

    private fun showStartFragment() {
        showMenu()
    }

    private fun showMenu() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.id_frame_container, FragmentMainMenu())
            .commit()
    }
}