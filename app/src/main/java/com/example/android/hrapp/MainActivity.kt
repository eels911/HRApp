package com.example.android.hrapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.android.hrapp.ui.FirstFragment
import com.example.android.hrapp.ui.LoginFragment
import com.example.android.hrapp.ui.SecondFragment
import com.example.android.hrapp.ui.ThirdFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
private lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_HRApp)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottomNavigationView)
        val firstFragment = FirstFragment()
        val loginFragment = LoginFragment()
        val secondFragment = SecondFragment()
        val thirdFragment = TelephoneBookFragment()
        setCurrentFragment(loginFragment)
        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.miHome -> setCurrentFragment(firstFragment)
                R.id.miProfile -> setCurrentFragment(secondFragment)
                R.id.miContacts-> setCurrentFragment(thirdFragment)
            }
            true
        }



    }
    fun setBottomNavigationVisibility(visibility: Int) {
        // get the reference of the bottomNavigationView and set the visibility.
        bottomNavigationView.visibility = visibility
    }


    private fun setCurrentFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
                .addToBackStack(null)
            commit()
        }

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