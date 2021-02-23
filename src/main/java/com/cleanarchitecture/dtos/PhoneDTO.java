package com.cleanarchitecture.dtos;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Getter
@Builder
public class PhoneDTO implements Serializable {
    private String ddd;
    private String number;
}
