package com.example.demo.service

interface BaseStudentService {
    fun customerResponse(name:String):String
    fun saveStudent( name:String)
}