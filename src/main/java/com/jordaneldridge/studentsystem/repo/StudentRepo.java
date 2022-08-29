package com.jordaneldridge.studentsystem.repo;

import com.jordaneldridge.studentsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface StudentRepo extends JpaRepository<Student, Integer> {
}
