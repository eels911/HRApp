package com.example.android.hrapp.domain

import com.example.android.hrapp.R
import com.example.android.hrapp.models.Worker

class WorkerDataSource {
    fun getWorkers(): ArrayList<Worker>{
        val list = ArrayList<Worker>()
        list.add(Worker(0,"Артур Ахунов", R.drawable.ic_avatar_placeholder,"+79776557687"))
        list.add(Worker(1,"Борис Борисов", R.drawable.ic_avatar_placeholder,"+79556557687"))
        list.add(Worker(2,"Владимир Владимиров", R.drawable.ic_avatar_placeholder,"+79776557687"))
        list.add(Worker(3,"Владимир Вдовин", R.drawable.ic_avatar_placeholder,"+79776557687"))
        list.add(Worker(4,"Дмитрий Дмитрией", R.drawable.ic_avatar_placeholder,"+79556557687"))
        list.add(Worker(5,"Глеб Глебов", R.drawable.ic_avatar_placeholder,"+79776557687"))
        list.add(Worker(6,"Егор Иванов", R.drawable.ic_avatar_placeholder,"+79776557687"))
        return list
    }
    fun getWorkersById(id: Int): Any? {
        val list = ArrayList<Worker>()
        list.add(Worker(0,"Артур Ахунов", R.drawable.ic_avatar_placeholder,"+79776557687"))
        list.add(Worker(1,"Борис Борисов", R.drawable.ic_avatar_placeholder,"+79556557687"))
        list.add(Worker(2,"Владимир Владимиров", R.drawable.ic_avatar_placeholder,"+79776557687"))
        list.add(Worker(3,"Владимир Вдовин", R.drawable.ic_avatar_placeholder,"+79776557687"))
        list.add(Worker(4,"Дмитрий Дмитрией", R.drawable.ic_avatar_placeholder,"+79556557687"))
        list.add(Worker(5,"Глеб Глебов", R.drawable.ic_avatar_placeholder,"+79776557687"))
        list.add(Worker(6,"Егор Иванов", R.drawable.ic_avatar_placeholder,"+79776557687"))
        return list.get(id)
    }
}