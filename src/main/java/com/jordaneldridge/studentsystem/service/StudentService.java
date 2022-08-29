package com.jordaneldridge.studentsystem.service;

import com.jordaneldridge.studentsystem.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);
    List<Student> getAllStudents();
}
