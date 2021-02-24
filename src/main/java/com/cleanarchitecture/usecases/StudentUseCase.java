package com.cleanarchitecture.usecases;

import com.cleanarchitecture.entities.Student;
import com.cleanarchitecture.repositories.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentUseCase {

    private StudentRepository studentRepository;

    public Student create(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> findAll() {
        List<Student> students = studentRepository.findAll();
        if (ObjectUtils.isEmpty(students)) {
            throw new EntityNotFoundException("Students not found");
        }
        return students;
    }
}
