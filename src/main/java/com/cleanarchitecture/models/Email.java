package com.cleanarchitecture.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Email {

    private String address;

    public Email(String address) {
        if (address == null ||
                !address.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new IllegalArgumentException("Email invalid");
        }

        this.address = address;
    }
}
