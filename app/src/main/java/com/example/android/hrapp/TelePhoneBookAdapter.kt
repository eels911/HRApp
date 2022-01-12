package com.example.android.hrapp

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.example.android.hrapp.models.Worker

class TelePhoneBookAdapter(   private val listener: OnWorkerListener) : RecyclerView.Adapter<TelePhoneBookAdapter.DataViewHolder>() {

    private var worker: List<Worker> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_telephone, parent, false)
        return DataViewHolder(view)
    }
    private fun getItem(position: Int): Worker = worker[position]
    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }

    override fun getItemCount(): Int = worker.size

    fun bindWorkers(newWorkers: List<Worker>) {
        worker = newWorkers
    }

    inner class DataViewHolder(v: View) : RecyclerView.ViewHolder(v) {


        private val avatar: ImageView = itemView.findViewById(R.id.img_headline)
        private val name: TextView = itemView.findViewById(R.id.text_name)
        private val telephone: TextView = itemView.findViewById(R.id.text_telephone)
        val clickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                val pos = adapterPosition
                Log.d("---------", "Click")

                if (pos != RecyclerView.NO_POSITION) {
                    listener.onClickContact(getItem(pos))
                }
            }
        }

        fun onBind(worker: Worker) {
            name.text = worker.name
            telephone.text = worker.telephone
            avatar.setImageResource(worker.avatar)

        }


        init {
            itemView.setOnClickListener(clickListener)
        }

        private val RecyclerView.ViewHolder.context
            get() = this.itemView.context
    }
    interface OnWorkerListener {
        fun onClickContact(worker: Worker)
    }
}