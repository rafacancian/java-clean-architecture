package com.cleanarchitecture.fixtures;

import com.cleanarchitecture.dtos.StudentDTO;

import java.util.Collections;

public class StudentDTOFixture {
    public static StudentDTO createBasic() {
        return StudentDTO.builder()
                .name("Rafael Mock")
                .cpf("381.111.543-43")
                .email("rafael.mock@example.com")
                .phones(Collections.singletonList(PhoneDTOFixture.createBasic()))
                .build();
    }
}
