package com.kazantsev.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.kazantsev.data.database.model.Department
import com.kazantsev.data.database.model.*

@Database(
    entities = [
        WorkersEntity::class,
        Department::class,
        Office::class,
        Vacation::class,
        Coordinating::class,
        News::class,
        Documents::class,
        Feedback::class,
        Status::class
    ],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract val favoriteDao: WorkersDao
}