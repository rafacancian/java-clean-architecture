package com.cleanarchitecture.adapters;

import com.cleanarchitecture.dtos.StudentDTO;
import com.cleanarchitecture.entities.Student;

public class StudentAdapter {

    public static Student ToModel(StudentDTO studentDTO) {
        return Student.builder().name(studentDTO.getName())
                .cpf(studentDTO.getCpf())
                .email(studentDTO.getEmail())
                .phones(PhoneAdapter.ToModel(studentDTO.getPhones()))
                .build();
    }
}
