package com.kazantsev.data.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Timestamp

@Entity(tableName = "workers")
data class WorkersEntity(
    @PrimaryKey val id: Int,
    val name: String,
    val lastName: String,
    val numTel: String,
    val status: Status,
    val department: Department
    )
@Entity(tableName = "Department")
data class Department (
    val id: Int,
    val name: String,
    val office: Office
    )
@Entity(tableName = "Office")
data class Office (
    val id: Int,
    val name: String,
    val address: String
    )
@Entity(tableName = "Vacation")
data class Vacation(
    val id: Int,
    val workersEntity: WorkersEntity,
    val data: Timestamp,
    val coordinating:Coordinating
)
@Entity(tableName = "Coordinating")
data class Coordinating (
    val workersEntity: WorkersEntity
)
@Entity(tableName = "News")
data class News(
    val id: Int,
    val name: String,
    val description: String
)
@Entity(tableName = "Documents")
data class Documents(
    val id: Int,
    val name: String,
    val document: String
)
@Entity(tableName = "Feedback")
data class Feedback(
    val id: Int,
    val name: String,
    val desctiption: String
)
@Entity(tableName = "Status")
data class Status (
    @PrimaryKey val id: Int,
    val Statusname: String
)



