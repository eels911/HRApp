package com.example.android.hrapp

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.android.hrapp.domain.WorkerDataSource
import com.example.android.hrapp.models.Worker

class FragmentContactDetails: Fragment(R.layout.fragment_contact_details) {
    private val name: TextView by lazy { requireView().findViewById<TextView>(R.id.name) }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val id = arguments?.getInt(TelephoneBookFragment.WORKER_ID) ?: 0
        name.setText(loadWorkerInfo(id).toString())

    }

    private fun loadWorkerInfo(id: Int): Any? {
       return WorkerDataSource().getWorkersById(id)

    }
}