package com.cleanarchitecture.gateways;

import com.cleanarchitecture.entities.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentGateway {

    List<Student> findAll();

    Student create(Student student);

}
