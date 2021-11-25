package com.hpe.androidroomdatabase.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.hpe.androidroomdatabase.entities.Director
import com.hpe.androidroomdatabase.entities.School

data class SchoolAndDirector(
    @Embedded val school: School,
    @Relation(
        // schoolName in school table
        parentColumn = "schoolName",
        // schoolName in director table
        entityColumn = "schoolName"
    )
    val director: Director
)