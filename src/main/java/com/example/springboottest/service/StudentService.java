package com.example.springboottest.service;

import com.example.springboottest.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public void createStudent() {
        List<Student> students = new ArrayList<>();
        List<Student> savedStudents = new ArrayList<>();

        students.add(new Student("Paddy Fox", "Class 9-5"));
        students.add(new Student("Sarah Jessica Parker", "Class 96"));
        students.add(new Student("James Bond", "Class 007"));

        Iterable<Student> itrStudents=repository.saveAll(students);
        itrStudents.forEach(savedStudents::add);
    }

    public Student retrieveStudent(Integer studentId) {

       return repository.findById(studentId).orElse(new Student());
    }
}
