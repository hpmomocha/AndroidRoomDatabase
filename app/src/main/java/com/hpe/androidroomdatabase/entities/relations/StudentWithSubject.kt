package com.hpe.androidroomdatabase.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.hpe.androidroomdatabase.entities.Student
import com.hpe.androidroomdatabase.entities.Subject

data class StudentWithSubject(
    @Embedded val student: Student,
    @Relation(
        parentColumn = "studentName",
        entityColumn = "subjectName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val subjects: List<Subject>
)