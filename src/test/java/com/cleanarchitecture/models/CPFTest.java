package com.cleanarchitecture.models;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CPFTest {

    @Test
    void shouldNotCreateCPFWithInvalidNumber() {
        // Must me replace for anonymous function
        assertThrows(IllegalArgumentException.class, createCPF(""));
        assertThrows(IllegalArgumentException.class, () -> new CPF("111.111.1"));
        assertThrows(IllegalArgumentException.class, () -> new CPF(null));
    }

    @Test
    void shouldCreateCPFWithValidNumber() {
        String cpfValido = "111.111.111-11";
        CPF cpf = new CPF(cpfValido);
        assertEquals(cpf.getNumber(), cpfValido);

    }

    //Just for example
    private Executable createCPF(String cpf) {
        return new Executable() {
            @Override
            public void execute() throws Throwable {
                new CPF(cpf);
            }
        };
    }

}
