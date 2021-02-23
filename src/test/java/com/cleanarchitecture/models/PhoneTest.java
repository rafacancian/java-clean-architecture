package com.cleanarchitecture.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PhoneTest {

    private static final String DDD_VALID = "19";
    private static final String NUMBER_VALID = "91313336";


    @Test
    void shouldNotCreatePhoneWithDDDsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> new Phone(null, NUMBER_VALID));
        assertThrows(IllegalArgumentException.class, () -> new Phone("", NUMBER_VALID));
        assertThrows(IllegalArgumentException.class, () -> new Phone("1", NUMBER_VALID));
    }

    @Test
    void shouldNotCreatePhoneWithNumberInvalid() {
        assertThrows(IllegalArgumentException.class, () -> new Phone(DDD_VALID, null));
        assertThrows(IllegalArgumentException.class, () -> new Phone(DDD_VALID, ""));
        assertThrows(IllegalArgumentException.class, () -> new Phone(DDD_VALID, "111233"));
    }

    @Test
    void shouldCreatePhoneWithDDDsAndNumberValid() {
        Phone phone = new Phone(DDD_VALID, NUMBER_VALID);
        assertEquals(phone.getDdd(), DDD_VALID);
        assertEquals(phone.getNumber(), NUMBER_VALID);
    }

}
