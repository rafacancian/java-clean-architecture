package com.cleanarchitecture.fixtures;

import com.cleanarchitecture.entities.Phone;

public class PhoneFixture {
    public static Phone createBasic() {
        return Phone.builder()
                .ddd("19")
                .number("81488111")
                .build();

    }
}
