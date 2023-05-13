package com.example.convidados.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Guest")
class GuestModel {

    @ColumnInfo
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0

    @ColumnInfo
    var name: String = ""

    @ColumnInfo
    var isPresent: Boolean = false
}
