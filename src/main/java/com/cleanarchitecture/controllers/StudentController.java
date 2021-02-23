package com.cleanarchitecture.controllers;

import com.cleanarchitecture.adapters.StudentAdapter;
import com.cleanarchitecture.dtos.StudentDTO;
import com.cleanarchitecture.models.Student;
import com.cleanarchitecture.usecases.StudentUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@AllArgsConstructor
public class StudentController {

    StudentUseCase studentUseCase;

    @GetMapping
    public ResponseEntity<List<Student>> findAll() {
        List<Student> students = studentUseCase.findAll();
        return ResponseEntity.ok(students);
    }

    @PostMapping
    public ResponseEntity<Student> create(@RequestBody StudentDTO studentDTO) {
        Student student = studentUseCase.create(StudentAdapter.ToModel(studentDTO));
        return ResponseEntity.ok(student);
    }
}
