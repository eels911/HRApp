package com.example.android.hrapp.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.android.hrapp.R

class SecondFragment : BaseFragment() {
    private val makeDial: ImageButton by lazy { requireView().findViewById<ImageButton>(R.id.ib_phone_icon) }
    private val numberHotLine: TextView by lazy { requireView().findViewById<TextView>(R.id.tv_hotlinedata) }
//    override var bottomNavigationViewVisibility = View.VISIBLE
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        makeDial.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + numberHotLine.text))
            startActivity(intent)
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_profile,container,false)
    }
}