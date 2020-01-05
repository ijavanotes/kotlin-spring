package com.example.demo.controller

import com.example.demo.dao.model.Student
import com.example.demo.service.BaseStudentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.CrudRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class StudentController(val helloService: BaseStudentService) {
   @GetMapping("/student")
    fun helloWorld(@RequestParam name:String): String {
        helloService.saveStudent(name)
        return helloService.customerResponse(name)
    }

}