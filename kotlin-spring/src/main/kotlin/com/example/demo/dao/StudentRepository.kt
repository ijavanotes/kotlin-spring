package com.example.demo.dao

import com.example.demo.dao.model.Student
import org.springframework.data.repository.CrudRepository

interface StudentRepository :CrudRepository<Student, Long> {
}