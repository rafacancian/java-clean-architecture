package com.cleanarchitecture.validations;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CPFValidationTest {

    @Test
    void shouldNotCreateCPFWithInvalidNumber() {
        // Must me replace for anonymous function
        assertThrows(IllegalArgumentException.class, () -> execute(""));
        assertThrows(IllegalArgumentException.class, () -> CpfValidation.execute("111.111.1"));
        assertThrows(IllegalArgumentException.class, () -> CpfValidation.execute(null));
    }

    @Test
    void shouldCreateCPFWithValidNumber() {
        String cpfValid = "111.111.111-11";
        assertDoesNotThrow(() -> CpfValidation.execute(cpfValid));
    }

    //Just for example
    private Executable execute(String cpf) {
        return new Executable() {
            @Override
            public void execute() throws Throwable {
                CpfValidation.execute(cpf);
            }
        };
    }

}
