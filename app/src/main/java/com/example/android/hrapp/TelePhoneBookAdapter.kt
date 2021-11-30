package com.example.android.hrapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.hrapp.models.Worker

class TelePhoneBookAdapter : RecyclerView.Adapter<DataViewHolder>() {

    private var worker: List<Worker> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_telephone,parent,false)
        return DataViewHolder(view)
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.onBind(worker[position])
    }

    override fun getItemCount(): Int = worker.size

    fun bindWorkers(newWorkers: List<Worker>){
        worker = newWorkers
    }
}
    class DataViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){


        private val avatar: ImageView = itemView.findViewById(R.id.img_headline)
        private val name: TextView = itemView.findViewById(R.id.text_name)
        private val telephone: TextView = itemView.findViewById(R.id.text_telephone)

        fun onBind(worker: Worker) {
            name.text = worker.name
            telephone.text = worker.telephone
            avatar.setImageResource(worker.avatar)

        }
    }

private val RecyclerView.ViewHolder.context
    get() = this.itemView.context
