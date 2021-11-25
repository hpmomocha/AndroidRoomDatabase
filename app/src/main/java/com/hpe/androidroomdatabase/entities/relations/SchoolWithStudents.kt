package com.hpe.androidroomdatabase.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.hpe.androidroomdatabase.entities.School
import com.hpe.androidroomdatabase.entities.Student

data class SchoolWithStudents (
    @Embedded val school: School,

    @Relation(
        // schoolName in school table
        parentColumn = "schoolName",
        // schoolName in student table
        entityColumn = "schoolName"
    )
    val students: List<Student>
)