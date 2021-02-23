package com.cleanarchitecture.dtos;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Getter
@Builder
@Document(value = "phone")
public class PhoneDTO implements Serializable {
    private String ddd;
    private String number;
}
