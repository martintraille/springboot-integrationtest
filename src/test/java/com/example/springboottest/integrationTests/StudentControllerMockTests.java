package com.example.springboottest.integrationTests;

import com.example.springboottest.model.Student;
import com.example.springboottest.service.StudentRepository;
import com.example.springboottest.service.StudentService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StudentControllerMockTests {

    @Autowired
    private StudentService studentService;

    @MockBean
    private StudentRepository studentRepository;

    @Test
    public void testRetrieveStudentWithMockRepository() {
        Optional<Student> optStudent = Optional.of( new Student("Paddy","Fox"));
        when(studentRepository.findById(1)).thenReturn(optStudent);

        assertTrue(studentService.retrieveStudent(1).getName().contains("Paddy"));
    }

}

