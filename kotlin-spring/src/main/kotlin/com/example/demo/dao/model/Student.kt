package com.example.demo.dao.model

import java.time.Year
import javax.persistence.*

@Entity
@Table(name = "student")
data class Student(@Id
                   @GeneratedValue(strategy = GenerationType.IDENTITY)
                   val id: Long,
                   @Column(nullable = false)
                   val name: String
)


