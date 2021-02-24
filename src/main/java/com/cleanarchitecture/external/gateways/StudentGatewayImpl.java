package com.cleanarchitecture.external.gateways;

import com.cleanarchitecture.entities.Student;
import com.cleanarchitecture.external.repositories.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentGatewayImpl implements StudentGateway {

    StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student create(Student student) {
        return studentRepository.save(student);
    }
}
