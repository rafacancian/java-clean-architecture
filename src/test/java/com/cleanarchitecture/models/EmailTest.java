package com.cleanarchitecture.models;

import com.cleanarchitecture.validations.CpfValidation;
import com.cleanarchitecture.validations.EmailValidation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EmailTest {

    @Test
    void shouldNotCreateEmailWithInvalidAddress() {
        assertThrows(IllegalArgumentException.class, () -> EmailValidation.execute(null));
        assertThrows(IllegalArgumentException.class, () -> EmailValidation.execute(""));
        assertThrows(IllegalArgumentException.class, () -> EmailValidation.execute("email.invalid.com"));
    }

    @Test
    void shouldCreateEmailWithValidAddress() {
        String emailValid = "rafael.mock@example.com";
        assertDoesNotThrow(() -> CpfValidation.execute(emailValid));
    }

}
