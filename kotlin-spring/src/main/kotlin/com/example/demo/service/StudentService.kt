package com.example.demo.service

import com.example.demo.dao.model.Student
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class StudentService(val repository: CrudRepository<Student, Long>) : BaseStudentService {

    override fun customerResponse(name: String): String {
        return "saved student for ${name}"
    }
    @Transactional
    override fun saveStudent(name: String) {
        var student: Student = Student(0, name)
        repository.save(student)
    }
}