package com.cleanarchitecture.usecases;

import com.cleanarchitecture.models.Student;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class StudentUseCase {

    public Student create(Student student) {
        return Student.builder().build();
    }

    public List<Student> findAll() {
        return Collections.singletonList(Student.builder().build());
    }
}
