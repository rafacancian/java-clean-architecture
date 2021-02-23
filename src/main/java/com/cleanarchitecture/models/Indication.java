package com.cleanarchitecture.models;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class Indication {

    private Student indicated;
    private Student indicative;
    private LocalDateTime indicateDate;

    public Indication(Student indicated, Student indicative) {
        this.indicated = indicated;
        this.indicative = indicative;
        this.indicateDate = LocalDateTime.now();
    }

}
