package com.cleanarchitecture.fixtures;

import com.cleanarchitecture.entities.Student;

import java.util.Collections;

public class StudentFixture {
    public static Student createBasic() {
        return Student.builder()
                .name("Rafael Mock")
                .cpf("381.111.543-43")
                .email("rafael.mock@example.com")
                .phones(Collections.singletonList(PhoneFixture.createBasic()))
                .build();
    }
}
