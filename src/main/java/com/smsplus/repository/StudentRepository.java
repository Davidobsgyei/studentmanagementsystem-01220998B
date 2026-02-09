package com.smsplus.repository;

import com.smsplus.model.Student;
import java.util.List;

public interface StudentRepository {
    void save(Student student);       // Add a new student
    List<Student> findAll();          // Retrieve all students
    Student findById(int id);         // Find student by ID
    void delete(int id);              // Delete student by ID
}
