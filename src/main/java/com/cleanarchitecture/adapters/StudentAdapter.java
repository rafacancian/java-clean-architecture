package com.cleanarchitecture.adapters;

import com.cleanarchitecture.dtos.StudentDTO;
import com.cleanarchitecture.models.CPF;
import com.cleanarchitecture.models.Email;
import com.cleanarchitecture.models.Phone;
import com.cleanarchitecture.models.Student;

import java.util.stream.Collectors;

public class StudentAdapter {

    public static Student ToModel(StudentDTO studentDTO) {
        return Student.builder().name(studentDTO.getName())
                .cpf(new CPF(studentDTO.getCpf()))
                .email(new Email(studentDTO.getEmail()))
//                .phones(Collections.singletonList(
//                        new Phone(studentDTO.getPhone().getDdd(), studentDTO.getPhone().getNumber())))
                .phones(studentDTO.getPhones()
                        .stream()
                        .map(e -> new Phone(
                                e.getDdd(),
                                e.getNumber()))
                        .collect(Collectors.toList()))
                .build();
    }
}
