package com.example.android.hrapp.domain

import com.example.android.hrapp.R
import com.example.android.hrapp.models.Worker

class WorkerDataSource {
    fun getWorkers(): List<Worker>{
        return listOf(
            Worker("Артур Ахунов", R.drawable.ic_avatar_placeholder,"+79776557687"),
            Worker("Борис Борисов", R.drawable.ic_avatar_placeholder,"+79556557687"),
            Worker("Владимир Владимиров", R.drawable.ic_avatar_placeholder,"+79776557687"),
            Worker("Владимир Вдовин", R.drawable.ic_avatar_placeholder,"+79776557687"),
            Worker("Дмитрий Дмитрией", R.drawable.ic_avatar_placeholder,"+79556557687"),
            Worker("Глеб Глебов", R.drawable.ic_avatar_placeholder,"+79776557687"),
            Worker("Егор Иванов", R.drawable.ic_avatar_placeholder,"+79776557687")
        )
    }
}