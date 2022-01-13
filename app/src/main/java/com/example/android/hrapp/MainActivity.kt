package com.example.android.hrapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.android.hrapp.ui.FirstFragment
import com.example.android.hrapp.ui.SecondFragment
import com.example.android.hrapp.ui.ThirdFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_HRApp)
        setContentView(R.layout.activity_main)
       val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()
        val thirdFragment = ThirdFragment()
        setCurrentFragment(firstFragment)
        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.miHome -> setCurrentFragment(firstFragment)
                R.id.miProfile -> setCurrentFragment(secondFragment)
                R.id.miContacts-> showTelephoneBook()
            }
            true
        }


//        showStartFragment()
    }
    private fun setCurrentFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }

    }

    fun showTelephoneBook(){
        showTelephoneBookFragment()
    }

    private fun showTelephoneBookFragment() {
        val newFragment = TelephoneBookFragment()

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.flFragment, newFragment)
            .addToBackStack(null)
            .commit()
    }

//    private fun showStartFragment() {
//        showMenu()
//    }

//    private fun showMenu() {
//        supportFragmentManager
//            .beginTransaction()
//            .replace(R.id.id_frame_container, FragmentMainMenu())
//            .commit()
//    }
}