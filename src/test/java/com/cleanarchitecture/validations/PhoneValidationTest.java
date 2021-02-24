package com.cleanarchitecture.validations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PhoneValidationTest {

    private static final String DDD_VALID = "19";
    private static final String NUMBER_VALID = "91313336";


    @Test
    void shouldNotCreatePhoneWithDDDsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> PhoneValidation.execute(null, NUMBER_VALID));
        assertThrows(IllegalArgumentException.class, () -> PhoneValidation.execute("", NUMBER_VALID));
        assertThrows(IllegalArgumentException.class, () -> PhoneValidation.execute("1", NUMBER_VALID));
    }

    @Test
    void shouldNotCreatePhoneWithNumberInvalid() {
        assertThrows(IllegalArgumentException.class, () -> PhoneValidation.execute(DDD_VALID, null));
        assertThrows(IllegalArgumentException.class, () -> PhoneValidation.execute(DDD_VALID, ""));
        assertThrows(IllegalArgumentException.class, () -> PhoneValidation.execute(DDD_VALID, "11223"));
    }

    @Test
    void shouldCreatePhoneWithDDDsAndNumberValid() {
        assertDoesNotThrow(() -> PhoneValidation.execute(DDD_VALID, NUMBER_VALID));
    }
}
