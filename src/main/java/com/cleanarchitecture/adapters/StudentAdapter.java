package com.cleanarchitecture.adapters;

import com.cleanarchitecture.dtos.StudentDTO;
import com.cleanarchitecture.entities.Phone;
import com.cleanarchitecture.entities.Student;

import java.util.stream.Collectors;

public class StudentAdapter {

    public static Student ToModel(StudentDTO studentDTO) {
        return Student.builder().name(studentDTO.getName())
                .cpf(studentDTO.getCpf())
                .email(studentDTO.getEmail())
//                .phones(Collections.singletonList(
//                        new Phone(studentDTO.getPhone().getDdd(), studentDTO.getPhone().getNumber())))
                .phones(studentDTO.getPhones()
                        .stream()
                        .map(e -> Phone.builder()
                                .ddd(e.getDdd())
                                .number(e.getNumber())
                                .build())
                        .collect(Collectors.toList()))
                .build();
    }
}
