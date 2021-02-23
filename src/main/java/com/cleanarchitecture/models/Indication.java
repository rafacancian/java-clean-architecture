package com.cleanarchitecture.models;

import com.cleanarchitecture.entities.Student;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
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
