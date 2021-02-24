package com.cleanarchitecture.fixtures;

import com.cleanarchitecture.dtos.PhoneDTO;

public class PhoneDTOFixture {
    public static PhoneDTO createBasic() {
        return PhoneDTO.builder()
                .ddd("19")
                .number("81488111")
                .build();
    }
}
