package com.example.android.hrapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.hrapp.domain.WorkerDataSource

class TelephoneBookFragment:Fragment() {

    private lateinit var adapter: TelePhoneBookAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.tele_book_fragment,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recycler: RecyclerView = view.findViewById(R.id.rvTeleBook)
        adapter = TelePhoneBookAdapter()
        recycler.layoutManager = LinearLayoutManager(requireContext())
        recycler.adapter = adapter
    }

    override fun onStart() {
        super.onStart()
        updateData()
    }

    private fun updateData() {
        adapter.bindWorkers(WorkerDataSource().getWorkers())
        adapter.notifyDataSetChanged()
    }

}