package com.cleanarchitecture.models;

import lombok.Getter;

@Getter
public class Phone {

    private String ddd;
    private String number;

    public Phone(String ddd, String number) {
        if (ddd == null || number == null) {
            throw new IllegalArgumentException("DDD and number are require");
        }

        if (!ddd.matches("\\d{2}")) {
            throw new IllegalArgumentException("Invalid DDD");
        }

        if (!number.matches("\\d{8}|\\d{9}")) {
            throw new IllegalArgumentException("Invalid Number");
        }
        this.ddd = ddd;
        this.number = number;
    }

}
