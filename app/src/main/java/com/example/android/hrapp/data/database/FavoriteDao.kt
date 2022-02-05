package com.kazantsev.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.kazantsev.data.database.model.WorkersEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface WorkersDao {
    @Query("DELETE  FROM workers")
    suspend fun deleteByid()

    @Query("DELETE  FROM Workers WHERE id = :id")
    suspend fun deleteByid(id: String)
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWorkers(item: WorkersEntity)

    @Query("SELECT * FROM Workers")
    fun getAllWorkers(): Flow<List<WorkersEntity>?>

    @Query("SELECT * FROM Workers")
    fun getWorkersFlow(): Flow<List<WorkersEntity>>

    @Query("SELECT * FROM Workers WHERE id = :id")
     fun getWorkersByidFlow(id: String): Flow<WorkersEntity?>

    @Query("SELECT * FROM Workers WHERE id = :id")
    suspend fun getWorkersByid(id: String): WorkersEntity?
}