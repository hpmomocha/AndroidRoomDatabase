package com.hpe.androidroomdatabase.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.hpe.androidroomdatabase.entities.Student
import com.hpe.androidroomdatabase.entities.Subject

data class SubjectWithStudent(
    @Embedded val subject: Subject,
    @Relation(
        parentColumn = "subjectName",
        entityColumn = "studentName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val students: List<Student>
)