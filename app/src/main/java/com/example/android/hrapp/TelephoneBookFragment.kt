package com.example.android.hrapp

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.hrapp.domain.WorkerDataSource
import com.example.android.hrapp.models.Worker
import com.example.android.hrapp.ui.BaseFragment
import kotlin.math.log

class TelephoneBookFragment:BaseFragment() {


    companion object { const val WORKER_ID = "WORKER_id" }
    private val adapter: TelePhoneBookAdapter by lazy { TelePhoneBookAdapter(contactDetails) }
    private val contactDetails = object : TelePhoneBookAdapter.OnWorkerListener {

        override fun onClickContact(worker: Worker) {
            val fragment = FragmentContactDetails()
            fragment.arguments = Bundle().apply { putInt(WORKER_ID, worker.id) }
            requireActivity().supportFragmentManager.beginTransaction()
//                .add(R.id.flFragment, fragment)
//                .addToBackStack(null).commit()
                .replace(R.id.flFragment, fragment)
                .addToBackStack(null)
                .commit()
            Log.d("FragmentContactDetails","пид")
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.tele_book_fragment,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recycler: RecyclerView = view.findViewById(R.id.rvTeleBook)
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