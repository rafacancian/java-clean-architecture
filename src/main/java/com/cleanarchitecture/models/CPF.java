package com.cleanarchitecture.models;

import lombok.Getter;

@Getter
public class CPF {

    private String number;

    public CPF(String number) {
        if (number == null ||
                !number.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")) {
            throw new IllegalArgumentException("Invalid CPF");
        }
        this.number = number;
    }

}
