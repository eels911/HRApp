package com.example.android.hrapp.domain

import com.example.android.hrapp.R
import com.example.android.hrapp.models.Worker

class WorkerDataSource {
    fun getWorkers(): ArrayList<Worker>{
        val list = ArrayList<Worker>()
        list.add(Worker("Артур Ахунов", R.drawable.ic_avatar_placeholder,"+79776557687"))
        list.add(Worker("Борис Борисов", R.drawable.ic_avatar_placeholder,"+79556557687"))
        list.add(Worker("Владимир Владимиров", R.drawable.ic_avatar_placeholder,"+79776557687"))
        list.add(Worker("Владимир Вдовин", R.drawable.ic_avatar_placeholder,"+79776557687"))
        list.add(Worker("Дмитрий Дмитрией", R.drawable.ic_avatar_placeholder,"+79556557687"))
        list.add(Worker("Глеб Глебов", R.drawable.ic_avatar_placeholder,"+79776557687"))
        list.add(Worker("Егор Иванов", R.drawable.ic_avatar_placeholder,"+79776557687"))
        return list
    }
}