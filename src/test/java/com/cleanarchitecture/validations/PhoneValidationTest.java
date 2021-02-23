package com.cleanarchitecture.validations;

import com.cleanarchitecture.entities.Phone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PhoneValidationTest {

    private static final String DDD_VALID = "19";
    private static final String NUMBER_VALID = "91313336";


    @Test
    void shouldNotCreatePhoneWithDDDsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> Phone.builder().ddd(null).number(NUMBER_VALID).build());
        assertThrows(IllegalArgumentException.class, () -> Phone.builder().ddd("").number(NUMBER_VALID).build());
        assertThrows(IllegalArgumentException.class, () -> Phone.builder().ddd("1").number(NUMBER_VALID).build());
    }

    @Test
    void shouldNotCreatePhoneWithNumberInvalid() {
        assertThrows(IllegalArgumentException.class, () -> Phone.builder().ddd(DDD_VALID).number(null).build());
        assertThrows(IllegalArgumentException.class, () -> Phone.builder().ddd(DDD_VALID).number("").build());
        assertThrows(IllegalArgumentException.class, () -> Phone.builder().ddd(DDD_VALID).number("11223").build());
    }

    @Test
    void shouldCreatePhoneWithDDDsAndNumberValid() {
        Phone phone = Phone.builder().ddd(DDD_VALID).number(NUMBER_VALID).build();
        assertEquals(phone.getDdd(), DDD_VALID);
        assertEquals(phone.getNumber(), NUMBER_VALID);
    }


}
