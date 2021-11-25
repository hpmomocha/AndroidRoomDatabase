package com.hpe.androidroomdatabase.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.StringBufferInputStream

@Entity
data class Subject (
    @PrimaryKey(autoGenerate = false)
    val subjectName: String,
)