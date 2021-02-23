package com.cleanarchitecture.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EmailTest {

    @Test
    void shouldNotCreateEmailWithInvalidAddress() {
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
        assertThrows(IllegalArgumentException.class, () -> new Email("email.invalid.com"));
    }

    @Test
    void shouldCreateEmailWithValidAddress() {
        String emailValid = "rafael.mock@example.com";
        Email email = Email.builder().address(emailValid).build();
        assertEquals(email.getAddress(), emailValid);
    }

}
