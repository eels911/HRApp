package com.example.android.hrapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.android.hrapp.MainActivity
import com.example.android.hrapp.R
import com.google.android.material.textfield.TextInputEditText

class LoginFragment: BaseFragment() {
    private val loginBtn: Button by lazy { requireView().findViewById<Button>(R.id.btn_login) }
    private val remember: CheckBox by lazy { requireView().findViewById<CheckBox>(R.id.cb_remember) }
    private val email: TextInputEditText by lazy { requireView().findViewById<TextInputEditText>(R.id.et_email) }
    private val password: TextInputEditText by lazy { requireView().findViewById<TextInputEditText>(R.id.et_password) }

    // set the visibility here, it takes care of setting the bottomNavigationView.
    override var bottomNavigationViewVisibility = View.GONE

    // override var navigationVisibility = View.GONE

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login,container,false)
        loginBtn.setOnClickListener { onClickBtn(email.text.toString()) }
        return v
    }

    fun onClickBtn(login:String) {
        val fragment = FirstFragment()

//        fragment.arguments = Bundle().apply { putString("Login", login) }
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.flFragment, fragment)
            .addToBackStack(null)
            .commit()
    }
}

abstract class BaseFragment: Fragment(){
    protected open var bottomNavigationViewVisibility = View.VISIBLE

    override fun onResume() {
        super.onResume()
        if (activity is MainActivity) {
            var  mainActivity = activity as MainActivity
            mainActivity.setBottomNavigationVisibility(bottomNavigationViewVisibility)
        }
    }
}