package com.example.android.hrapp

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.android.hrapp.domain.WorkerDataSource
import java.util.regex.Matcher
import java.util.regex.Pattern

class FragmentContactDetails : Fragment(R.layout.fragment_contact_details) {
    private val profileNumber: TextView by lazy { requireView().findViewById<TextView>(R.id.tv_profile_number) }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val id = arguments?.getInt(TelephoneBookFragment.WORKER_ID) ?: 0

        val data = loadWorkerInfo(id).toString()
//        if (name.contains("telephone=",false))
        val pattern: Pattern = Pattern.compile("(\\+*)\\d{11}")
        val matcher: Matcher = pattern.matcher(data)
        if (matcher.find())
            profileNumber.setText(matcher.group(0))

    }

    private fun loadWorkerInfo(id: Int): Any? {
        return WorkerDataSource().getWorkersById(id)
    }
}